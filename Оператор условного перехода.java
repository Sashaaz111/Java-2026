/*
Запишите следующий код через конструкцию ? :

int i = 0;
if (a == 1) {
    i = 1;
} else if (a == 2) {
    i = 2;
} else {
    i = 3; 
}
*/

import java.util.Scanner;

public class Module2Theme5Task1 {
    public static void main(String[] args) {

        Scanner NewScanner = new Scanner(System.in);
        int a = NewScanner.nextInt();

        int i = (a == 1) ? 1 : (a == 2 ? 2 : 3);
        
        System.out.println(i);
        NewScanner.close();
    }
}
