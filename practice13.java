public class practice13 {
    // инициализация при объявлении
    public final int a1 = 10;

    // инициализация в блоке инициализации
    public final int a2;
    {
        a2 = 20;
    }

    // инициализация в конструкторе
    public final int a3;
    public practice13(int value) {
        a3 = value;
    }

    public static void main(String[] args) {
        practice13 obj = new practice13(30);
        System.out.println(obj.a1);
        System.out.println(obj.a2);
        System.out.println(obj.a3);
    }
}