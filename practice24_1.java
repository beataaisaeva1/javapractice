interface MyInterface {
    // неабстрактный метод 
    default void defaultMethod() {
        System.out.println("Default метод интерфейса");
    }

    // статический метод
    static void staticMethod() {
        System.out.println("Статический метод интерфейса");
    }
}

// класс, реализующий интерфейс
class MyClass implements MyInterface {
    // можно переопределить default метод
    @Override
    public void defaultMethod() {
        System.out.println("Переопределённый default метод");
    }
}

public class practice24_1 {
    public static void main(String[] args) {
        // вызов через объект класса
        MyClass obj = new MyClass();
        obj.defaultMethod(); // вызов переопределённого default метода

        // вызов default метода родителя через интерфейс по умолчанию
        MyInterface i = new MyClass();
        i.defaultMethod();

        // вызов статического метода интерфейса
        MyInterface.staticMethod();
    }
}