public class FinalDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.show();
    }
}

class Parent {
    public final void print() {
        System.out.println("Parent print");
    }

    public void show() {
        System.out.println("Parent show");
    }
}

class Child extends Parent {
    // public void print() { } // ОШИБКА! Нельзя переопределить final метод

    public void show() {
        System.out.println("Child show");
    }
}

final class FinalClass {
    void test() {
        System.out.println("Final class");
    }
}

// class SubClass extends FinalClass { } // ОШИБКА! Нельзя наследовать final класс
