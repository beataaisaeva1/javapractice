public class practice15 {
    // метод с переменным числом int параметров
    public static void sum(int... numbers) {
        int result = 0;
        for (int n : numbers) {
            result += n;
        }
        System.out.println("Сумма = " + result);
    }

    // метод с переменным числом String параметров
    public static void print(String... words) {
        for (String w : words) {
            System.out.println(w);
        }
    }

    public static void main(String[] args) {
        // вызов метода sum
        sum(1, 2, 3);
        sum(10, 20);

        // вызов метода print
        print("Java", "Python", "C++");
    }
}