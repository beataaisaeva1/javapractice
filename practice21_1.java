class Outer {
    public class PublicInner {
        void show() {
            System.out.println("public внутренний класс");
        }
    }

    protected class ProtectedInner {
        void show() {
            System.out.println("protected внутренний класс");
        }
    }

    class DefaultInner {
        void show() {
            System.out.println("default внутренний класс");
        }
    }

    private class PrivateInner {
        void show() {
            System.out.println("private внутренний класс");
        }
    }

    void testPrivateInner() {
        PrivateInner inner = new PrivateInner();
        inner.show();
    }
}

public class practice21_1 {
    public static void main(String[] args) {
        Outer outer = new Outer();

        Outer.PublicInner publicInner = outer.new PublicInner();
        publicInner.show();

        Outer.ProtectedInner protectedInner = outer.new ProtectedInner();
        protectedInner.show();

        Outer.DefaultInner defaultInner = outer.new DefaultInner();
        defaultInner.show();

        // PrivateInner доступен только внутри Outer1
        outer.testPrivateInner();
    }
}