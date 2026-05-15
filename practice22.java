// интерфейс
interface MyInterface {
    // вложенный класс внутри интерфейса
    class NestedClass {
        public void func() {
            System.out.println("Метод вложенного класса");
        }
    }
}

public class practice22 {
    public static void main(String[] args) {
        // создание объекта вложенного класса
        MyInterface.NestedClass obj = new MyInterface.NestedClass();
        // вызов метода вложенного класса
        obj.func();
    }
}