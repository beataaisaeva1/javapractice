import java.util.StringJoiner;

public class practice25_2 {
    public static void main(String[] args) {
        // создаём StringJoiner с разделителем ", "
        StringJoiner joiner1 = new StringJoiner(", ");

        // добавляем элементы
        joiner1.add("Яблоко");
        joiner1.add("Банан");
        joiner1.add("Вишня");

        // преобразуем в строку
        System.out.println("1. Простой пример: " + joiner1);

        // создаём StringJoiner с разделителем ", ", префиксом "[" и суффиксом "]"
        StringJoiner joiner2 = new StringJoiner(", ", "[", "]");

        joiner2.add("Красный");
        joiner2.add("Зелёный");
        joiner2.add("Синий");

        System.out.println("2. С префиксом и суффиксом: " + joiner2);

        // объединение двух StringJoiner с помощью merge()
        StringJoiner joiner3 = new StringJoiner(", ", "{", "}");

        joiner3.add("A");
        joiner3.add("B");

        // объединяем с joiner1 (яблоки, бананы, вишня)
        joiner3.merge(joiner1);

        System.out.println("3. Объединение через merge(): " + joiner3);

        // получение длины результирующей строки
        System.out.println("4. Длина строки joiner2: " + joiner2.length());
    }
}