// собственное перечисление
enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    // дополнительный метод
    public boolean isWeekend() {
        // проверяем, является ли день выходным
        return this == SATURDAY || this == SUNDAY;
    }
}

public class practice16_2 {
    public static void main(String[] args) {
        Day d1 = Day.MONDAY;
        Day d2 = Day.SATURDAY;
        System.out.println(d1.isWeekend());
        System.out.println(d2.isWeekend());
    }
}