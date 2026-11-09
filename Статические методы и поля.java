public class CallExample {
    public static void main(String[] args) {
        A.printVars();

        A obj = new A();
        obj.printVars();

        A ref = null;
        ref.printVars();
    }
}

class A {
    public static int a = 1;
    public static int b = 2;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }
}
