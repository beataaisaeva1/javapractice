import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String name = scanner.next();

        System.out.println("Привет, " + name);

        scanner.close();
    }
}
