enum Season {
    // элементы перечисления и их значения
    WINTER("Зима", -10),
    SPRING("Весна", 10),
    SUMMER("Лето", 25),
    AUTUMN("Осень", 5);

    // поля enum
    private String name;
    private int temperature;

    // конструктор enum
    Season(String name, int temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    // метод для вывода информации
    public void printInfo() {
        System.out.println(name + ": " + temperature);
    }
}

public class practice16_1 {
    public static void main(String[] args) {
        // использование элементов перечисления
        Season s1 = Season.SUMMER;
        Season s2 = Season.WINTER;
        s1.printInfo();
        s2.printInfo();
    }
}