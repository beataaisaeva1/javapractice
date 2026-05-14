enum Color {
    RED,
    BLUE
}

public class practice7 {
    public static void main(String[] args) {
        // int
        int number = 2;
        switch (number) {
            case 1:
                System.out.println("int: Один");
                break;
            case 2:
                System.out.println("int: Два");
                break;
        }

        // char
        char letter = 'A';
        switch (letter) {
            case 'A':
                System.out.println("char: Буква A");
                break;
            case 'B':
                System.out.println("char: Буква B");
                break;
        }

        // String
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("String: Понедельник");
                break;
            case "Tuesday":
                System.out.println("String: Вторник");
                break;
        }

        // enum
        Color color = Color.RED;
        switch (color) {
            case RED:
                System.out.println("enum: Красный");
                break;
            case BLUE:
                System.out.println("enum: Синий");
                break;
        }

        // Integer
        Integer value = 1;
        switch (value) {
            case 1:
                System.out.println("Integer: Один");
                break;
            case 2:
                System.out.println("Integer: Два");
                break;
        }

        // byte
        byte b = 1;
        switch (b) {
            case 1:
                System.out.println("byte: 1");
                break;
        }

        // short
        short s = 2;
        switch (s) {
            case 2:
                System.out.println("short: 2");
                break;
        }

        // Character
        Character ch = 'X';
        switch (ch) {
            case 'X':
                System.out.println("Character: Символ X");
                break;
        }
    }
}