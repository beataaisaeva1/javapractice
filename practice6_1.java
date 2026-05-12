public class practice6_1 {
    public static void main(String[] args) {
        // Десятичное число
        Integer a = Integer.decode("25");
        // Восьмеричная система (0)
        Integer b = Integer.decode("012");
        // Шестнадцатеричная система (0x)
        Integer c = Integer.decode("0x12");

        System.out.println(a); // 25
        System.out.println(b); // 10
        System.out.println(c); // 18
    }
}