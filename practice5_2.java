public class practice5_2 {
    public static void main(String[] args) {
        Object obj = "Hello";
        // Проверка объекта на тип String
        System.out.println(obj instanceof String);
        // Проверка объекта на тип Object
        System.out.println(obj instanceof Object);
        Object num = 10;
        // Проверка объекта на тип Integer
        System.out.println(num instanceof Integer);
        // Пример с null
        String nullString = null;
        // Для null instanceof всегда возвращает false
        System.out.println(nullString instanceof String);
    }
}