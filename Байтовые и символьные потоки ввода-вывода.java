import java.io.*;

public class Stream {
    public static void main(String[] args) throws IOException {
        System.out.println("Практика 1\n");

        File file = new File("test.txt");
        if (!file.exists()) {
            FileWriter fw = new FileWriter("test.txt");
            fw.write("Hello");
            fw.close();
        }

        FileInputStream fis = new FileInputStream("test.txt");
        int data = fis.read();
        System.out.println("Первый байт: " + (char) data);
        fis.close();

        System.out.println("\nПрактика 2\n");

        FileOutputStream fos = new FileOutputStream("output.txt");
        fos.write(72);
        fos.close();
        System.out.println("Записан байт 72 ('H') в файл");
    }
}
