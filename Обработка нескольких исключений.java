public class MultiCatch {
        System.out.println("--- Одинаковая обработка ---");

        try {
            int choice = 1;

            if (choice == 1) {
                int a = 10 / 0;
            } else if (choice == 2) {
                int[] arr = new int[5];
                arr[10] = 100;
            } else {
                String s = null;
                s.length();
            }

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Перехвачено: " + e.getClass().getSimpleName());
            System.out.println("Сообщение: " + e.getMessage());
        }

        System.out.println("\n--- Иерархия исключений ---");

        try {
            throw new Ex3();
        } catch (Ex1 e) {
            System.out.println("Поймано Ex1: " + e.getMessage());
        }

        try {
            throw new Ex2();
        } catch (Ex1 e) {
            System.out.println("Поймано Ex1: " + e.getMessage());
        }
    }
}

class Ex1 extends Exception {
    public Ex1() {
        super("Исключение Ex1");
    }
}

class Ex2 extends Ex1 {
    public Ex2() {
        super();
    }
}

class Ex3 extends Ex2 {
    public Ex3() {
        super();
    }
}
