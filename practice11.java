// пример перегрузки методов
class Calculator {
    // метод с двумя int
    int sum(int a, int b) {
        return a + b;
    }

    // перегруженный метод с тремя int
    int sum(int a, int b, int c) {
        return a + b + c;
    }

    // перегруженный метод с double
    double sum(double a, double b) {
        return a + b;
    }
}

// пример переопределения методов
class Animal {
    void sound() {
        System.out.println("Животное издает звук");
    }
}

class Dog extends Animal {
    // переопределение метода родительского класса
    @Override
    void sound() {
        System.out.println("Собака лает");
    }
}

public class practice11 {
    public static void main(String[] args) {
        // перегрузка
        Calculator calc = new Calculator();
        System.out.println(calc.sum(2, 3));
        System.out.println(calc.sum(2, 3, 4));
        System.out.println(calc.sum(2.5, 3.5));

        // переопределение
        Dog dog = new Dog();
        dog.sound();
    }
}