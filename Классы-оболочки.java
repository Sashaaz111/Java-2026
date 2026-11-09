public class Task {
    public static void main(String[] args) {
        //Приведите примеры использования методы decode().
        Integer valInteger = Integer.decode("17");
        Integer valIntegerHex = Integer.decode("0x11");
        Integer valIntegerOct = Integer.decode("021");

        System.out.println(valInteger);
        System.out.println(valIntegerHex);
        System.out.println(valIntegerOct);

        //Приведите все способы создания экземпляра класса Boolean
        Boolean b1 = Boolean.valueOf(true);//напрямую
        Boolean b2 = Boolean.valueOf("true");//через строку
        Boolean b3 = true;//автоупаковка
        Boolean b4 = Boolean.TRUE;//константа

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        //В каком случае при автоупаковке/автораспаковке будет брошено исключение NullPointerException. Приведите пример.

        Integer a = null;
        Integer b = 10;
        int sum = a + b;//NullPointerException
    }
}
