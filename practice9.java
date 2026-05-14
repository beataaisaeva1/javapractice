import java.util.Arrays;

public class practice9 {
    public static void main(String[] args) {
        int[] array1 = {5, 2, 8, 1, 3};
        int[] array2 = {1, 2, 3, 5, 8};

        // Сортировка массива
        Arrays.sort(array1);

        // Преобразование массива в строку
        System.out.println(Arrays.toString(array1));

        // Поиск элемента в отсортированном массиве
        int index = Arrays.binarySearch(array1, 5);
        System.out.println("Индекс числа 5: " + index);

        // Сравнение массиво
        boolean equal = Arrays.equals(array1, array2);
        System.out.println("Массивы равны: " + equal);

        // Лексикографическое сравнение массивов
        int result = Arrays.compare(array1, array2);
        System.out.println("Результат compare: " + result);
    }
}