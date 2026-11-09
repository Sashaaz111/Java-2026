public class A {
    public final int a;

    public A() {
        a = 10;
    }

    public A(int value) {
        a = value;
    }
}

class Test {
    public static void main(String[] args) {
        A_ obj1 = new A();
        A obj2 = new A(25);

        System.out.println("obj1.a = " + obj1.a);
        System.out.println("obj2.a = " + obj2.a);
    }
}
