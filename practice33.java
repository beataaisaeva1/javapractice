import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class practice33 {
    public static void main(String[] args) {
        try {
            // открываем текстовый файл
            File file = new File("test.txt");

            // Scanner читает данные из файла
            Scanner scanner = new Scanner(file);

            // чтение файла построчно
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            // закрываем Scanner
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}