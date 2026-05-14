import java.util.ArrayList;
import java.util.List;

public class practice14_1 {
    public static void main(String[] args) {
        // Параметризованный список String
        List<String> list1 = new ArrayList<>();

        // Параметризованный список Integer
        List<Integer> list2 = new ArrayList<>();

        // Проверка через instanceof
        System.out.println(list1 instanceof List);
        System.out.println(list1 instanceof ArrayList);
        System.out.println(list2 instanceof List);
        System.out.println(list2 instanceof ArrayList);
    }
}