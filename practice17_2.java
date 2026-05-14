// final-класс
final class Animal {
    void sound() {
        System.out.println("Звук животного");
    }
}

// Ошибка:
// нельзя наследоваться от final-класса
/*
class Dog extends Animal {
}
*/

public class practice17_2 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();
    }
}