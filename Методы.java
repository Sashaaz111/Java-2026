class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Animal_12 {
    void sound() {
        System.out.println("Some sound");
    }
}

class Dog_12 extends Animal_12 {
    void sound() {
        System.out.println("Bark");
    }
}

public class MethodsDemo {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(2, 3));
        System.out.println(c.add(2, 3, 4));

        Animal_12 a = new Dog_12();
        a.sound();
    }
}
