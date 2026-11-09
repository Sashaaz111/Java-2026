public class Task {
    public static void main(String[] args) {
        //Типы данных
        byte valByte = 0;
        short valShort = 0;
        int valInt = 0;
        long valLong = 0;
        float valFloat = 0;
        double valDouble = 0;
        char valChar = 0;
        boolean valBool = false;

        valByte = 2;
        valShort = 4;
        valInt = 52;
        valLong = 222228;
        valFloat = 5.2f;
        valDouble = 6.7;
        valChar = 'I';
        valBool = true;
        
        //Напечатайте в консоли свое имя, используя при этом символы в формате Unicode.

        System.out.println("Name: \u0421\u0430\u0448\u0430 "); //Саша

        //Приведите пример использования перегруженного оператора + с объектами типа String и переменными принадлежащим другим типам (объектам и базовым типам).

        System.out.println("Home №" + 52);
        System.out.println("value " + 'x');
        System.out.println("Result " + true);

        //Приведите примеры, когда арифметические операции выполняются с переменными различных типов. Объясните результат.
        valByte = 4;
        valDouble = 6.7;
        valChar = 'x';
        System.out.println(valByte + valDouble); //Byte преобразуется к Double, как к вещественному типу
        System.out.println(valByte + valChar); //Char преобразуется в целочисленный тип для сложения с Byte

        //Приведите примеры сужающего преобразования типов.
        int valueI = 16;
        short valueS = (short)valueI;

        //Самостоятельно изучите, что означает type interface и приведите пример с использование var.
        var character = 'x'; //char
        var line = "Good"; //String
        var rNum = 5.4; //double
    }
}
