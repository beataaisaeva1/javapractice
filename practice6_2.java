public class practice6_2 {
    public static void main(String[] args) {
        // Через константы Boolean
        Boolean b1 = Boolean.TRUE;
        Boolean b2 = Boolean.FALSE;

        // Через valueOf(boolean)
        Boolean b3 = Boolean.valueOf(true);

        // Через valueOf(String)
        Boolean b4 = Boolean.valueOf("true");

        // Автоупаковка
        Boolean b5 = true;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
    }
}
