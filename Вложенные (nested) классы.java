public class NestedInInterfaceDemo {
    public static void main(String[] args) {
        MyInterface.NestedClass nested = new MyInterface.NestedClass();
        nested.show();

        MyInterface.NestedInterfaceImpl impl = new MyInterface.NestedInterfaceImpl();
        impl.print();
    }
}

interface MyInterface {
    void doSomething();

    class NestedClass {
        public void show() {
            System.out.println("Вложенный класс в интерфейсе");
        }
    }

    interface NestedInterface {
        void print();
    }

    class NestedInterfaceImpl implements NestedInterface {
        public void print() {
            System.out.println("Реализация вложенного интерфейса");
        }
    }
}
