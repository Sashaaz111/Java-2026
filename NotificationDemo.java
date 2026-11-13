import java.util.List;


public class NotificationDemo {

    public record Device(String platform, String appVersion) {}

    // 1. SEALED INTERFACE

    public sealed interface Notification permits Email, Sms, Push, Webhook {}


    // 2. RECORDS

    public record Email(String address, String message) implements Notification {
        public Email {
            if (message == null || message.isBlank()) {
                throw new IllegalArgumentException("Текст письма не может быть пустым");
            }
            if (address == null || !address.contains("@")) {
                throw new IllegalArgumentException("Некорректный email-адрес: " + address);
            }
            address = address.trim().toLowerCase(); 
        }

        public String domain() {
            return address.substring(address.indexOf('@') + 1);
        }
    }

    public record Sms(String phone, String text) implements Notification {}
    public record Push(String title, int badgeCount, Device device) implements Notification {}

    public non-sealed static class Webhook implements Notification {
        private final String url;
        private final String payload;

        public Webhook(String url, String payload) {
            this.url = url;
            this.payload = payload;
        }
        public String url() { return url; }
        public String payload() { return payload; }
    }


    // 3. PATTERN MATCHING FOR SWITCH 
  
    public static String dispatch(Notification notification) {
        return switch (notification) {
            case null ->
                "[ПРОПУСК] Уведомление не задано (null)";

            case Email(String addr, String msg) when addr.endsWith("@company.org") ->
                String.format("[ВНУТРЕННЯЯ ПОЧТА -> %s] Срочное сообщение: %s", addr, msg);

            case Email(_, String msg) ->
                String.format("[ВНЕШНЯЯ ПОЧТА] Отправлено письмо: \"%s\"", msg);

            case Push(String title, int badge, Device(String os, String ver)) when os.equalsIgnoreCase("iOS") ->
                String.format("[APNs iOS v%s] Заголовок: \"%s\" (бейдж на иконке: %d)", ver, title, badge);

            case Push(String title, _, Device(String os, _)) ->
                String.format("[FCM %s] Пуш-уведомление: \"%s\"", os, title);

            case Sms(String phone, String txt) ->
                String.format("[SMS -> %s] Текст (%d симв.): %s", phone, txt.length(), txt);

            case Webhook wh when wh.url().startsWith("https://") ->
                String.format("[WEBHOOK SECURE] POST %s | Данные: %s", wh.url(), wh.payload());

            case Webhook wh ->
                String.format("[WEBHOOK INSECURE] Предупреждение! Незащищенный URL: %s", wh.url());
        };
    }

    // 4. PATTERN MATCHING FOR INSTANCEOF 
  
    public static void checkPriorityAlert(Notification notification) {
        if (notification instanceof Push(String title, int badge, Device(String os, _)) && badge >= 10) {
            System.out.printf("  -> [ВНИМАНИЕ] Много непрочитанных уведомлений (%d шт.) на устройстве %s (тема: %s)%n",
                    badge, os, title);
        }
    }


    public static void main(String[] args) {
        System.out.println("ПРОВЕРКА АВТО-МЕТОДОВ И НОРМАЛИЗАЦИИ RECORD");
        Email email1 = new Email("  Dev@Company.ORG ", "Сборка проекта завершена успешно");
        Email email2 = new Email("dev@company.org", "Сборка проекта завершена успешно");

        System.out.println("toString() запись : " + email1);
        System.out.println("Кастомный метод   : домен = " + email1.domain());
        System.out.println("equals() по полям : " + email1.equals(email2)); 

        System.out.println("\nПРОВЕРКА ВАЛИДАЦИИ В КОМПАКТНОМ КОНСТРУКТОРЕ");
        try {
            new Email("invalid-email", "Привет!");
        } catch (IllegalArgumentException e) {
            System.out.println("Перехвачено ожидаемое исключение: " + e.getMessage());
        }

        System.out.println("\nПРОВЕРКА PATTERN MATCHING, ВЛОЖЕННЫХ ПАТТЕРНОВ И ГАРДОВ");
        List<Notification> queue = List.of(
            email1,
            new Email("user@gmail.com", "Ваш отчет готов к скачиванию"),
            new Sms("+7-999-123-45-67", "Код подтверждения входа: 8492"),
            new Push("Новое сообщение в чате", 3, new Device("iOS", "17.4")),
            new Push("Обновление системы", 15, new Device("Android", "14.0")), 
            new Webhook("https://api.example.com/hook", "{ \"event\": \"build_ok\" }")
        );

        for (Notification item : queue) {
            System.out.println(dispatch(item));
            checkPriorityAlert(item);
        }

        System.out.println(dispatch(null));

        System.out.println("\nПРОВЕРКА ЛОКАЛЬНОГО RECORD (LOCAL RECORD) ВНУТРИ МЕТОДА");
        record LogEntry(String channel, String result) {}

        queue.stream()
            .map(n -> new LogEntry(n.getClass().getSimpleName(), dispatch(n)))
            .limit(2)
            .forEach(entry -> System.out.println("Запись журнала: " + entry));
    }
}