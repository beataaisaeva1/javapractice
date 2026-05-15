class Animal {
    String sound() {
        return "Звук животного";
    }
}

class Dog extends Animal {
    @Override
    String sound() {
        return "Собака лает";
    }
}