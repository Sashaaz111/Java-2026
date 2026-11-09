public class Task {

    public void show(int... nums) {
        System.out.println("int varargs: " + nums.length);
    }

    public void show(String... strs) {
        System.out.println("String varargs: " + strs.length);
    }

    public void show(String msg, int... nums) {
        System.out.println(msg + " " + nums.length);
    }

    public static void main(String[] args) {
        VarargsDemo obj = new VarargsDemo();

        obj.show(1, 2, 3);
        obj.show("A", "B");
        obj.show("Sum:", 5, 10);
    }
}
