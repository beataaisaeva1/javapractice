class MyResource implements AutoCloseable {
    // метод автоматически вызовется при завершении try
    @Override
    public void close() {
        System.out.println("Ресурс закрыт");
    }

    void work() {
        System.out.println("Работа с ресурсом");
    }
}

public class practice32_3 {
    public static void main(String[] args) {
        try (MyResource r = new MyResource()) {
            r.work();
        }
    }
}