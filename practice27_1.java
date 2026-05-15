public class practice27_1 {
    public static void main(String[] args) {
        boolean flag = true;
        char letter = 'A';
        int number = 123;
        double pi = 3.14159;
        String text = "Java";

        // %b — логическое значение
        System.out.printf("1. Логическое значение: %b%n", flag);

        // %c — символ
        System.out.printf("2. Символ: %c%n", letter);

        // %d — целое десятичное число
        System.out.printf("3. Целое число: %d%n", number);

        // %f — число с плавающей точкой
        System.out.printf("4. Число с плавающей точкой: %.2f%n", pi);

        // %s — строка
        System.out.printf("5. Строка: %s%n", text);
    }
}