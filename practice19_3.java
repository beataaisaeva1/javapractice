class Animal {
    void sound() {
        System.out.println("Звук животного");
    }
}

class Dog extends Animal {
    @Override
    void saund() {
        System.out.println("Собака лает");
    }
}