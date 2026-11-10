public class AnnotationDemo {
    public static void main(String[] args) {
        Child_29 c = new Child_29();
        c.show();

        OldClass_29 old = new OldClass_29();
        old.oldMethod();

        WarningDemo_29 w = new WarningDemo_29();
        w.methodWithWarning();
    }
}

class Parent {
    void show() {
        System.out.println("Parent show");
    }
}

class Child extends Parent_29 {
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
