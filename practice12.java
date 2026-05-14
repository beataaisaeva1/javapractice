public class practice12 {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        // Вызов через имя класса
        practice12.printVars();

        // Вызов внутри своего класса без имени класса
        printVars();

        // Вызов через объект
        practice12 obj = new practice12();
        obj.printVars();
    }
}