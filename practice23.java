import java.util.ArrayList;

class Animal {
    void sound() {
        System.out.println("Звук животного");
    }
}

class Dog extends Animal {
    // @Override помогает компилятору проверить, что метод переопределяет метод родителя
    @Override
    void sound() {
        System.out.println("Собака лает");
    }
}

class Test {
    // @Deprecated помечает устаревший метод
    @Deprecated
    void oldMethod() {
        System.out.println("Устаревший метод");
    }

    void newMethod() {
        System.out.println("Новый метод");
    }
}

public class practice23 {
    @SuppressWarnings("unchecked") // отключает предупреждения компилятора
    public static void main(String[] args) {
        // используем переопределение
        Dog dog = new Dog();
        dog.sound();

        // используем устаревший метод
        Test test = new Test();
        test.oldMethod();

        // пример SuppressWarnings 
        ArrayList list = new ArrayList();
        list.add("Java");
        System.out.println(list);
    }
}