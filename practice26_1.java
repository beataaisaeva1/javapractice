public class practice26_1 {
    public static void main(String[] args) {
        // StringBuilder
        StringBuilder sb = new StringBuilder("Java");

        // append() — добавляет текст в конец строки
        sb.append(" Programming");
        System.out.println("1. append(): " + sb);

        // insert() — вставляет текст по указанному индексу
        sb.insert(5, "Language ");
        System.out.println("2. insert(): " + sb);

        // replace() — заменяет часть строки
        sb.replace(5, 13, "Awesome ");
        System.out.println("3. replace(): " + sb);

        // delete() — удаляет часть строки
        sb.delete(5, 13);
        System.out.println("4. delete(): " + sb);

        // reverse() — переворачивает строку
        sb.reverse();
        System.out.println("5. reverse(): " + sb);
        // возвращаем обратно
        sb.reverse();

        // charAt() — возвращает символ по индексу
        System.out.println("6. charAt(): " + sb.charAt(0));

        // length() — возвращает длину строки
        System.out.println("7. length(): " + sb.length());

        // capacity() — показывает вместимость буфера
        System.out.println("8. capacity(): " + sb.capacity());

        // setCharAt() — изменяет символ по индексу
        sb.setCharAt(0, 'j');
        System.out.println("9. setCharAt(): " + sb);

        // toString() — преобразует объект в String
        String text = sb.toString();
        System.out.println("10. toString(): " + text);

        // StringBuffer
        StringBuffer buffer = new StringBuffer("Hello");

        // append() для StringBuffer
        buffer.append(" World");
        System.out.println("StringBuffer: " + buffer);
    }
}




