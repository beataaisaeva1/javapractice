class Outer {
    private int privateValue = 1;
    protected int protectedValue = 2;
    public int publicValue = 3;
    int defaultValue = 4;

    private void privateMethod() {
        System.out.println("private метод внешнего класса");
    }

    class Inner {
        void showOuter() {
            // внутренний класс имеет доступ ко всем полям и методам внешнего класса
            System.out.println(privateValue);
            System.out.println(protectedValue);
            System.out.println(publicValue);
            System.out.println(defaultValue);
            privateMethod();
        }
    }
}

public class practice21_2 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.showOuter();
    }
}