public class Exceptions {
    public static void main(String[] args) {
        // 1. ArithmeticException
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("1. ArithmeticException: " + e.getMessage());
        }

        // 2. ArrayIndexOutOfBoundsException
        try {
            int[] arr = {1, 2, 3};
            int x = arr[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("2. ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // 3. IllegalArgumentException
        try {
            setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("3. IllegalArgumentException: " + e.getMessage());
        }

        // 4. ClassCastException
        try {
            Object obj = "String";
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("4. ClassCastException: " + e.getMessage());
        }

        // 5. NullPointerException
        try {
            String str = null;
            int len = str.length();
        } catch (NullPointerException e) {
            System.out.println("5. NullPointerException: " + e.getMessage());
        }
    }

    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным: " + age);
        }
        System.out.println("Возраст: " + age);
    }
}
