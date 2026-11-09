class AccessExample {
    private int privateVar = 10;
    int defaultVar = 20;
    protected int protectedVar = 30;
    public int publicVar = 40;

    private void privateMethod() {
        System.out.println("Private method");
    }

    void defaultMethod() {
        System.out.println("Default method");
    }

    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    public void publicMethod() {
        System.out.println("Public method");
    }

    public void testSameClass() {
        System.out.println("=== Тест из того же класса ===");
        System.out.println(privateVar);
        System.out.println(defaultVar);
        System.out.println(protectedVar);
        System.out.println(publicVar);
        privateMethod();
        defaultMethod();
        protectedMethod();
        publicMethod();
    }
}

class SamePackageTest {
    public void test() {
        AccessExample obj = new AccessExample();
        System.out.println("=== Тест из того же пакета (не подкласс) ===");
        System.out.println(obj.defaultVar);
        System.out.println(obj.protectedVar);
        System.out.println(obj.publicVar);
        obj.defaultMethod();
        obj.protectedMethod();
        obj.publicMethod();
    }
}

class SubclassSamePackage extends AccessExample {
    public void test() {
        System.out.println("=== Тест из подкласса в том же пакете ===");
        System.out.println(defaultVar);
        System.out.println(protectedVar);
        System.out.println(publicVar);
        defaultMethod();
        protectedMethod();
        publicMethod();
    }
}

class AccessDemo {
    public static void main(String[] args) {
        AccessExample obj = new AccessExample();
        obj.testSameClass();

        System.out.println();

        SamePackageTest test1 = new SamePackageTest();
        test1.test();

        System.out.println();

        SubclassSamePackage test2 = new SubclassSamePackage();
        test2.test();
    }
}
