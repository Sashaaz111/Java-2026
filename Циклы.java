public class CyclesCompact {
    public static void main(String[] args) {

        // 1. БЕСКОНЕЧНЫЕ ЦИКЛЫ

        // Бесконечный while
        while (true) {
            System.out.println("Бесконечный while");
        }

        // Бесконечный do-while
        do {
            System.out.println("Бесконечный do-while");
        } while (true);


        // 2. BREAK И CONTINUE

        // break - выход из цикла
        for (int i = 1; i <= 10; i++) {
            if (i == 5) break;
            System.out.print(i + " "); // 1 2 3 4
        }

        System.out.println(); // перевод строки

        // continue - пропуск итерации
        for (int i = 1; i <= 5; i++) {
            if (i == 3) continue;
            System.out.print(i + " "); // 1 2 4 5
        }
    }
}
