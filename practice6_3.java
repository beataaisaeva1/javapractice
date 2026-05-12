public class practice6_3 {
    public static void main(String[] args) {
        Integer value = null;

        // Автораспаковка null приведет к NullPointerException
        int number = value;

        System.out.println(number);
    }
}