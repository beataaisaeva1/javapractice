class Outer {
    class Inner {
        private int privateValue = 10;
        protected int protectedValue = 20;
        public int publicValue = 30;
        int defaultValue = 40;

        private void privateMethod() {
            System.out.println("private метод внутреннего класса");
        }
    }

    void showInner() {
        Inner inner = new Inner();
        // Внешний класс имеет доступ ко всем полям и методам внутреннего класса
        System.out.println(inner.privateValue);
        System.out.println(inner.protectedValue);
        System.out.println(inner.publicValue);
        System.out.println(inner.defaultValue);
        inner.privateMethod();
    }
}

public class practice21_3 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.showInner();
    }
}


