public class AnnotationDemo {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();

        OldClass old = new OldClass();
        old.oldMethod();

        WarningDemo w = new WarningDemo();
        w.methodWithWarning();
    }
}

class Parent {
    void show() {
        System.out.println("Parent show");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child show");
    }
}

class OldClass {
    @Deprecated
    void oldMethod() {
        System.out.println("Устаревший метод");
    }
}

class WarningDemo {
    @SuppressWarnings("unchecked")
    void methodWithWarning() {
        java.util.List list = new java.util.ArrayList();
        list.add("Без предупреждения");
        System.out.println("Предупреждение подавлено");
    }
}
