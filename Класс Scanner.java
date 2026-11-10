import java.io.*;
import java.util.Scanner;

public class Scanner {
    public static void main(String[] args) throws IOException {
        File file = new File("data.txt");
        if (!file.exists()) {
            FileWriter fw = new FileWriter("data.txt");
            fw.write("10 20 30\nПривет Мир\nJava");
            fw.close();
        }

        Scanner sc = new Scanner(new File("data.txt"));

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Сумма: " + (a + b + c));

        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println("Строки: " + str1 + " " + str2);

        String str3 = sc.next();
        System.out.println("Еще строка: " + str3);

        sc.close();
    }
}
