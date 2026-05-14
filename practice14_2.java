import java.util.ArrayList;
import java.util.List;

public class practice14_2 {
    // <? extends Number>
    // Означает: Number или любой его наследник. 
    // Используется, когда нужно только читать данные.

    public static void printNumbers(List<? extends Number> list) {
        for (Number n : list) {
            System.out.println(n);
        }
        // Добавлять элементы нельзя,
        // так как точный тип неизвестен.
        // list.add(10); // ошибка
    }

    // <? super Integer>
    // Означает: Integer или любой его родитель.
    // Используется, когда нужно добавлять данные.
    public static void addNumbers(List<? super Integer> list) {
        // Можно безопасно добавлять Integer
        list.add(10);
        list.add(20);
        System.out.println(list);
    }

    public static void main(String[] args) {
        // Список Integer
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);

        // Список Double
        List<Double> doubles = new ArrayList<>();
        doubles.add(1.5);
        doubles.add(2.5);

        // Метод принимает любые наследники Number
        printNumbers(integers);
        printNumbers(doubles);

        // Список Number
        List<Number> numbers = new ArrayList<>();

        // Метод принимает Integer или его родителя
        addNumbers(numbers);
    }
}