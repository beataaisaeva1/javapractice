// первый интерфейс
interface InterfaceA {
    void show();
}

// второй интерфейс
interface InterfaceB {
    void show();
}

// класс, реализующий оба интерфейса
class MyClass implements InterfaceA, InterfaceB {
    // нужно реализовать общий метод show() один раз
    @Override
    public void show() {
        System.out.println("Реализация метода show для обоих интерфейсов");
    }
}

public class practice24_2 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        // метод вызывается как обычный метод класса
        obj.show();
    }
}