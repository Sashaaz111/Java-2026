public class ExceptionFlow {
    public static void main(String[] args) {
        // Исключение 1: будет перехвачено
        try {
            System.out.println("Пробуем разделить на ноль...");
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Перехвачено ArithmeticException: " + e.getMessage());
        }

        System.out.println("\nПрограмма продолжает работу после первого исключения\n");

        // Исключение 2: приведет к аварийной остановке
        System.out.println("Пробуем обратиться к null объекту...");
        String str = null;
        int length = str.length();

        System.out.println("Эта строка не выведется");
    }
}
