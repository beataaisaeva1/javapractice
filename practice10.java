// public — доступен из любого класса
class PublicExample {
    public int publicValue = 10;
}

// Спецификатор отсутствует
// Доступен только внутри пакета
class DefaultExample {
    int defaultValue = 20;
}

// protected — доступен внутри пакета и в классах-наследниках
class Parent {
    protected int protectedValue = 30;
}

// Наследование
class Child extends Parent {
    public void showProtected() {
        System.out.println(protectedValue);
    }
}

// private — доступен только внутри своего класса
class PrivateExample {
    private int privateValue = 40;
    public void showPrivate() {
        System.out.println(privateValue);
    }
}

public class practice10 {
    public static void main(String[] args) {
        PublicExample p = new PublicExample();
        System.out.println(p.publicValue);

        DefaultExample d = new DefaultExample();
        System.out.println(d.defaultValue);

        Child c = new Child();
        c.showProtected();

        PrivateExample pr = new PrivateExample();
        pr.showPrivate();
    }
}