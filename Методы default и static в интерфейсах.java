public class InterfaceDefaultStatic {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        System.out.println("=== Вызов через объект ===");
        obj.defaultMethod();

        System.out.println("\n=== Вызов статического метода через интерфейс ===");
        MyInterface.staticMethod();

        System.out.println("\n=== Вызов переопределенного метода ===");
        obj.overrideMethod();
    }
}

interface MyInterface {
    default void defaultMethod() {
        System.out.println("Default метод из интерфейса");
    }

    static void staticMethod() {
        System.out.println("Static метод из интерфейса");
    }

    default void overrideMethod() {
        System.out.println("Default метод который можно переопределить");
    }
}

class MyClass implements MyInterface_30 {
    @Override
    public void overrideMethod() {
        System.out.println("Переопределенный метод в классе");
    }
}
