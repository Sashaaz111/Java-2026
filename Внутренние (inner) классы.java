public class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();

        Outer.PublicInner publicInner = outer.new PublicInner();
        publicInner.show();

        Outer.ProtectedInner protectedInner = outer.new ProtectedInner();
        protectedInner.show();

        Outer.DefaultInner defaultInner = outer.new DefaultInner();
        defaultInner.show();

        // Outer.PrivateInner - НЕДОСТУПНО извне
    }
}

class Outer {
    private String privateField = "private поле Outer";
    public String publicField = "public поле Outer";

    public class PublicInner {
        private String innerPrivate = "private поле Inner";
        public String innerPublic = "public поле Inner";

        public void show() {
            System.out.println("=== PublicInner ===");
            System.out.println("Доступ к privateField: " + privateField);
            System.out.println("Доступ к publicField: " + publicField);
            System.out.println("Доступ к innerPrivate: " + innerPrivate);
        }
    }

    protected class ProtectedInner {
        public void show() {
            System.out.println("=== ProtectedInner ===");
            System.out.println("Доступ к privateField: " + privateField);
        }
    }

    class DefaultInner {
        public void show() {
            System.out.println("=== DefaultInner ===");
            System.out.println("Доступ к privateField: " + privateField);
        }
    }

    private class PrivateInner {
        private String secret = "secret";

        private void innerMethod() {
            System.out.println("Метод PrivateInner");
        }
    }

    public void accessInner() {
        PrivateInner pi = new PrivateInner();
        System.out.println("=== Внешний класс обращается к PrivateInner ===");
        System.out.println("Доступ к secret: " + pi.secret);
        pi.innerMethod();
    }
}
