public class MyException_37 {
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (AgeException_37 e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            checkAge(25);
            System.out.println("Возраст подходит");
        } catch (AgeException_37 e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    static void checkAge(int age) throws AgeException_37 {
        if (age < 18) {
            throw new AgeException_37("Возраст " + age + " меньше 18");
        }
    }
}

class AgeException_37 extends Exception {
    public AgeException_37() {
        super();
    }

    public AgeException_37(String message) {
        super(message);
    }
}
