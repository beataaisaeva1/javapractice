public class practice29 {
    static void testMethod() throws NullPointerException {
        String text = null;
        // генерация NullPointerException
        System.out.println(text.length());
    }

    public static void main(String[] args) {
        try {
            // генерация ArithmeticException
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            // исключение перехвачено
            System.out.println("ArithmeticException обработано");
        } finally {
            System.out.println("Блок finally выполнен");

        }

        // NullPointerException не перехватывается
        // и приведет к аварийному завершению программы

        testMethod();
    }
}