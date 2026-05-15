public class practice25_1 {
    public static void main(String[] args) {
        // исходная строка
        String str = "  Java Programming  ";
        // length() — возвращает длину строки
        System.out.println("Длина строки: " + str.length());

        // charAt(index) — возвращает символ по индексу
        System.out.println("Символ на позиции 5: " + str.charAt(5));

        // substring(beginIndex, endIndex) — извлекает подстроку
        System.out.println("Подстрока с 5 по 16: " + str.substring(5, 16));

        // toUpperCase() — переводит строку в верхний регистр
        System.out.println("В верхнем регистре: " + str.toUpperCase());

        // toLowerCase() — переводит строку в нижний регистр
        System.out.println("В нижнем регистре: " + str.toLowerCase());

        // trim() — удаляет пробелы в начале и конце строки
        System.out.println("Без пробелов по краям: '" + str.trim() + "'");

        // replace(oldChar, newChar) — заменяет символы
        System.out.println("Замена 'a' на '@': " + str.replace('a', '@'));

        // contains(CharSequence) — проверяет, содержит ли строка подстроку
        System.out.println("Содержит 'Java'? " + str.contains("Java"));

        // startsWith(String) и endsWith(String) — проверка начала и конца
        System.out.println("Начинается с '  Ja'? " + str.startsWith("  Ja"));
        System.out.println("Заканчивается на 'ing  '? " + str.endsWith("ing  "));

        // indexOf(String) — возвращает индекс первого вхождения подстроки
        System.out.println("Индекс подстроки 'Programming': " + str.indexOf("Programming"));
    }
}


