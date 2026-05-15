public class practice28 {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: деление на ноль");
        }

        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: выход за границы массива");
        }

        try {
            throw new IllegalArgumentException("Неверный аргумент");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }

        try {
            Object obj = "Java";
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: неверное преобразование типа");
        }

        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: обращение к null");
        }
    }
}