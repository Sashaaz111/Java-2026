public class StringBuilderBufferDemo {
    public static void main(String[] args) {
        System.out.println("=== StringBuilder методы ===\n");

        StringBuilder sb = new StringBuilder("Hello");

        // 1. append()
        sb.append(" World");
        System.out.println("1. append(\" World\"): " + sb);

        // 2. insert()
        sb.insert(5, ",");
        System.out.println("2. insert(5, \",\"): " + sb);

        // 3. delete()
        sb.delete(5, 6);
        System.out.println("3. delete(5, 6): " + sb);

        // 4. deleteCharAt()
        sb.deleteCharAt(5);
        System.out.println("4. deleteCharAt(5): " + sb);

        // 5. replace()
        sb.replace(6, 11, "Java");
        System.out.println("5. replace(6, 11, \"Java\"): " + sb);

        // 6. reverse()
        sb.reverse();
        System.out.println("6. reverse(): " + sb);
        sb.reverse();

        // 7. substring()
        String sub = sb.substring(6);
        System.out.println("7. substring(6): " + sub);

        // 8. length()
        System.out.println("8. length(): " + sb.length());

        // 9. charAt()
        System.out.println("9. charAt(1): " + sb.charAt(1));

        // 10. setCharAt()
        sb.setCharAt(1, 'a');
        System.out.println("10. setCharAt(1, 'a'): " + sb);

        System.out.println("\n=== Преобразования ===\n");

        String str = "Java";
        StringBuilder sb2 = new StringBuilder(str);
        System.out.println("String -> StringBuilder: " + sb2);

        String str2 = sb2.toString();
        System.out.println("StringBuilder -> String: " + str2);

        String str3 = "Programming";
        StringBuffer sbf = new StringBuffer(str3);
        System.out.println("String -> StringBuffer: " + sbf);

        String str4 = sbf.toString();
        System.out.println("StringBuffer -> String: " + str4);

        StringBuffer sbf2 = new StringBuffer(sb2.toString());
        System.out.println("StringBuilder -> StringBuffer: " + sbf2);

        StringBuilder sb3 = new StringBuilder(sbf2.toString());
        System.out.println("StringBuffer -> StringBuilder: " + sb3);
    }
}
