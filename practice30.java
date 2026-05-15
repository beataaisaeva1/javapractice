// базовое исключение
class Ex1 extends Exception {
}

// наследник Ex1
class Ex2 extends Ex1 {
}

// наследник Ex2
class Ex3 extends Ex2 {
}

public class practice30 {
    // метод может выбрасывать разные исключения
    static void test(int value) throws Ex1 {
        if (value == 1) {
            throw new Ex1();
        }
        if (value == 2) {
            throw new Ex2();
        }
        if (value == 3) {
            throw new Ex3();
        }
    }
    public static void main(String[] args) {
        try {
            test(3);
        }
        // несколько исключений обрабатываются одинаково
        catch (Ex2 e) {
            System.out.println("Ex2 или Ex3 обработано одинаково");
        }
        // обработка базового исключения
        catch (Ex1 e) {
            System.out.println("Ex1 обработано");
        }
    }
}