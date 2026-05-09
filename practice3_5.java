public class practice3_5 {
    public static void main(String[] args) {
        // int + double
        int a = 5;
        double b = 2.5;

        // int преобразуется в double
        double result1 = a + b;

        System.out.println(result1); // 7.5

        // byte + short
        byte c = 10;
        short d = 20;

        // byte и short преобразуются в int
        int result2 = c + d;

        System.out.println(result2); // 30

        // long + float
        long e = 100L;
        float f = 5.5f;

        // long преобразуется в float
        float result3 = e + f;

        System.out.println(result3); // 105.5

        // int / double
        int g = 7;
        double h = 2;

        // int преобразуется в double, поэтому деление будет вещественным
        double result4 = g / h;

        System.out.println(result4); // 3.5
    }
}