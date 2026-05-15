import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class practice32_1 {
    public static void main(String[] args) {
        try {
            // FileInputStream — подкласс InputStream
            InputStream input = new FileInputStream("test.txt");

            int data;

            while ((data = input.read()) != -1) {
                System.out.print((char) data);
            }

            input.close();

        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}