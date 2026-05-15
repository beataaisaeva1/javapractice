class A {
    int value = 10;
    A() {
        System.out.println("Конструктор класса A");
    }
    void method() {
        System.out.println("Метод класса A");
    }
}

class B extends A {
    int value = 20;
    B() {
        super(); // вызов конструктора суперкласса A
    }
    void show() {
        System.out.println(super.value); // доступ к полю суперкласса
        super.method(); // вызов метода суперкласса
    }
}

public class practice18_1 {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}