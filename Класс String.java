import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        StringJoiner sj1 = new StringJoiner(", ");
        sj1.add("Яблоко");
        sj1.add("Банан");
        sj1.add("Апельсин");
        System.out.println("Пример 1: " + sj1);

        StringJoiner sj2 = new StringJoiner(", ", "[", "]");
        sj2.add("Красный");
        sj2.add("Синий");
        sj2.add("Зеленый");
        System.out.println("Пример 2: " + sj2);

        StringJoiner sj3 = new StringJoiner("; ");
        sj3.add("Один").add("Два").add("Три");
        System.out.println("Пример 3: " + sj3);
    }
}

public class StringMethods {
    public static void main(String[] args) {
        String str = "  Hello Java World  ";
        String str2 = "hello";

        // 1. length()
        System.out.println("1. length(): " + str.length());

        // 2. charAt()
        System.out.println("2. charAt(1): " + str.charAt(1));

        // 3. toLowerCase()
        System.out.println("3. toLowerCase(): " + str.toLowerCase());

        // 4. toUpperCase()
        System.out.println("4. toUpperCase(): " + str.toUpperCase());

        // 5. trim()
        System.out.println("5. trim(): '" + str.trim() + "'");

        // 6. substring()
        System.out.println("6. substring(2, 7): " + str.substring(2, 7));

        // 7. equals()
        System.out.println("7. equals(\"hello\"): " + str2.equals("hello"));

        // 8. equalsIgnoreCase()
        System.out.println("8. equalsIgnoreCase(\"HELLO\"): " + str2.equalsIgnoreCase("HELLO"));

        // 9. contains()
        System.out.println("9. contains(\"Java\"): " + str.contains("Java"));

        // 10. replace()
        System.out.println("10. replace('o', 'X'): " + str.replace('o', 'X'));
    }
}
