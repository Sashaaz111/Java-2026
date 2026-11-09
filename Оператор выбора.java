public class Task {

    // enum для демонстрации
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {

        // 1. Целочисленные примитивные типы
        System.out.println("=== Примитивные типы ===");

        // byte
        byte b = 2;
        switch(b) {
            case 1: System.out.println("byte = 1"); break;
            case 2: System.out.println("byte = 2"); break;
            default: System.out.println("byte = другое");
        }

        // short
        short s = 3;
        switch(s) {
            case 1: System.out.println("short = 1"); break;
            case 2: System.out.println("short = 2"); break;
            case 3: System.out.println("short = 3"); break;
            default: System.out.println("short = другое");
        }

        // char
        char c = 'B';
        switch(c) {
            case 'A': System.out.println("char = A"); break;
            case 'B': System.out.println("char = B"); break;
            case 'C': System.out.println("char = C"); break;
            default: System.out.println("char = другое");
        }

        // int
        int i = 5;
        switch(i) {
            case 1: System.out.println("int = 1"); break;
            case 5: System.out.println("int = 5"); break;
            default: System.out.println("int = другое");
        }

        // 2. Оболочки целочисленных типов (autoboxing)
        System.out.println("\n=== Оболочки (Wrapper types) ===");

        // Byte
        Byte byteWrapper = 3;
        switch(byteWrapper) {
            case 1: System.out.println("Byte = 1"); break;
            case 2: System.out.println("Byte = 2"); break;
            case 3: System.out.println("Byte = 3"); break;
            default: System.out.println("Byte = другое");
        }

        // Short
        Short shortWrapper = 100;
        switch(shortWrapper) {
            case 50: System.out.println("Short = 50"); break;
            case 100: System.out.println("Short = 100"); break;
            default: System.out.println("Short = другое");
        }

        // Character
        Character charWrapper = 'X';
        switch(charWrapper) {
            case 'X': System.out.println("Character = X"); break;
            case 'Y': System.out.println("Character = Y"); break;
            default: System.out.println("Character = другое");
        }

        // Integer
        Integer intWrapper = 42;
        switch(intWrapper) {
            case 42: System.out.println("Integer = 42"); break;
            case 100: System.out.println("Integer = 100"); break;
            default: System.out.println("Integer = другое");
        }

        // 3. enum
        System.out.println("\n=== Enum ===");

        Day today = Day.WEDNESDAY;
        switch(today) {
            case MONDAY:
                System.out.println("Понедельник");
                break;
            case TUESDAY:
                System.out.println("Вторник");
                break;
            case WEDNESDAY:
                System.out.println("Среда");
                break;
            case THURSDAY:
                System.out.println("Четверг");
                break;
            case FRIDAY:
                System.out.println("Пятница");
                break;
            case SATURDAY:
                System.out.println("Суббота");
                break;
            case SUNDAY:
                System.out.println("Воскресенье");
                break;
        }

        // 4. String
        System.out.println("\n=== String ===");

        String fruit = "apple";
        switch(fruit.toLowerCase()) {
            case "apple":
                System.out.println("Это яблоко");
                break;
            case "banana":
                System.out.println("Это банан");
                break;
            case "orange":
                System.out.println("Это апельсин");
                break;
            default:
                System.out.println("Неизвестный фрукт");
        }


}   }
