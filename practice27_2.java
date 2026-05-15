import java.util.Date;

public class practice27_2 {
    public static void main(String[] args) {
        // текущая дата и время
        Date date = new Date();

        // %tH — часы в формате 00-23
        System.out.printf("1. Час: %tH%n", date);

        // %tM — минуты
        System.out.printf("2. Минуты: %tM%n", date);

        // %tS — секунды
        System.out.printf("3. Секунды: %tS%n", date);

        // %tY — год в четырехзначном формате
        System.out.printf("4. Год: %tY%n", date);

        // %tB — полное название месяца
        System.out.printf("5. Месяц: %tB%n", date);
    }
}




