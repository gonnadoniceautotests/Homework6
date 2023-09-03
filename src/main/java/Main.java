public class Main {
    public static void main(String[] args) {

        int a = 10;
        double b = 15.4;
        float c = 13.3f;
        short d = 22;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " +  (a++)); // На экран выводится 10
        System.out.println("a   = " +  (a));
        System.out.println("b--   = " +  (b--));
        System.out.println("b  = " +  (b)); // 14.4 после b--
        // Проверьте разницу в d++ и ++d
        System.out.println("d++   = " +  (d++)); // 22 + 1 => d = 23
        System.out.println("++d   = " +  (++d)); // 1+23 => d = 24


        byte maxByte = Byte.MAX_VALUE;
        int maxInt = Integer.MAX_VALUE;
        long maxLong = Long.MAX_VALUE;
        double maxDouble = Double.MAX_VALUE;
        float maxFloat = Float.MAX_VALUE;
        short maxShort = Short.MAX_VALUE;


        // Переполнение числовых видов переменных
        System.out.println(maxByte + maxByte);
        System.out.println(maxShort + maxShort);
        System.out.println(maxInt + maxInt); // -2
        System.out.println(maxLong + maxLong); // -2
        System.out.println(maxDouble + maxDouble); // Бесконечность
        System.out.println(maxFloat + maxFloat);  // Бесконечность
    }
}
