// суперкласс
class Animal {
    // final-метод
    final void sound() {
        System.out.println("Звук животного");
    }
}

// Подкласс
class Dog extends Animal {
    // ошибка:
    // final-метод нельзя переопределить
    /*
    @Override
    void sound() {
        System.out.println("Собака лает");
    }
    */
}

public class practice17_1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        // будет вызван метод родительского класса
        dog.sound();
    }
}