public class practice8_2 {
    public static void main(String[] args) {
        // Пример использования continue
        for (int i = 1; i <= 5; i++) {
            // Пропускаем число 3
            if (i == 3) {
                continue;
            }
            System.out.println("continue: " + i);
        }
        // Пример использования break
        for (int j = 1; j <= 5; j++) {
            // Прерываем цикл при j = 3
            if (j == 3) {
                break;
            }
            System.out.println("break: " + j);
        }
    }
}