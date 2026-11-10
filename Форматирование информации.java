import java.util.Calendar;
import java.util.Formatter;

public class FormatterDemo {
    public static void main(String[] args) {
        System.out.println(" Практика 1\n");

        String name = "Иван";
        System.out.printf("1. %%s: Привет, %s!%n", name);

        int age = 25;
        System.out.printf("2. %%d: Возраст: %d лет%n", age);

        double price = 99.99;
        System.out.printf("3. %%f: Цена: %.2f руб%n", price);

        boolean isReady = true;
        System.out.printf("4. %%b: Готов: %b%n", isReady);

        System.out.printf("5. %%n: Это текст%nс новой строки%n");

        System.out.println("\n Практика 3\n");

        Calendar cal = Calendar.getInstance();

        System.out.printf("1. %%tH: %tH часов%n", cal);
        System.out.printf("2. %%tM: %tM минут%n", cal);
        System.out.printf("3. %%tS: %tS секунд%n", cal);
        System.out.printf("4. %%tB: %tB%n", cal);
        System.out.printf("5. %%tA: %tA%n", cal);

}
