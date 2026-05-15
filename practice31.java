// собственное исключение
class MyFirstException extends Exception {
    // конструктор без параметров
    public MyFirstException() {
        super();
    }

    // конструктор с сообщением
    public MyFirstException(String message) {
        super(message);
    }

    // конструктор с сообщением и причиной
    public MyFirstException(String message, Throwable cause) {
        super(message, cause);
    }

}

public class practice31 {
    // метод может выбросить собственное исключение
    static void checkAge(int age) throws MyFirstException {
        if (age < 18) {
            throw new MyFirstException(
                    "Возраст меньше 18"
            );
        }
        System.out.println("Доступ разрешён");
    }
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (MyFirstException e) {

            System.out.println(
                    "Обработано исключение: "
                    + e.getMessage()
            );
        }
    }
}