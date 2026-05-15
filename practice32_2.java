import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class practice32_2 {
    public static void main(String[] args) {
        try {
            // FileOutputStream — подкласс OutputStream
            OutputStream output = new FileOutputStream("test.txt");

            output.write(72); // H
            output.write(101); // e
            output.write(108); // l
            output.write(108); // l
            output.write(111); // o

            output.close();

            System.out.println("Данные записаны в файл");
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}