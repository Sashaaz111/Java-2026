public class OverloadDemo {
    public static void main(String[] args) {
        Calculator_23 c = new Calculator_23();
        System.out.println(c.add(2, 3));
        System.out.println(c.add(2, 3, 4));
        System.out.println(c.add(2.5, 3.7));
    }
}

class Calculator_23 {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class OverrideDemo {
    public static void main(String[] args) {
        Animal_23 a = new Dog_23();
        a.sound();
    }
}

class Animal_23 {
    void sound() {
        System.out.println("Some sound");
    }
}

class Dog_23 extends Animal_23 {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

public class OverrideErrorDemo {
    public static void main(String[] args) {
        System.out.println("Этот код не скомпилируется");
    }
}

class Parent_23 {
    int getValue() {
        return 10;
    }
}

class Child_23 extends Parent {
    // Ошибка! Тип возвращаемого значения должен быть int
    // @Override
    // double getValue() {
    //     return 10.5;
    // }
}
