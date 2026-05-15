public class practice26_2 {
    public static void main(String[] args) {
        // исходный объект String
        String str = "Java";

        // String -> StringBuffer
        // конструктор StringBuffer(String str)
        StringBuffer buffer = new StringBuffer(str);
        System.out.println("String -> StringBuffer: " + buffer);

        // String -> StringBuilder
        // конструктор StringBuilder(String str)
        StringBuilder builder = new StringBuilder(str);
        System.out.println("String -> StringBuilder: " + builder);

        // StringBuffer -> String
        // метод toString()
        String strFromBuffer = buffer.toString();
        System.out.println("StringBuffer -> String: " + strFromBuffer);

        // StringBuilder -> String
        // метод toString()
        String strFromBuilder = builder.toString();
        System.out.println("StringBuilder -> String: " + strFromBuilder);

        // StringBuffer -> StringBuilder
        // через toString() и конструктор StringBuilder
        StringBuilder builderFromBuffer =
                new StringBuilder(buffer.toString());
        System.out.println("StringBuffer -> StringBuilder: " + builderFromBuffer);

        // StringBuilder -> StringBuffer
        // через toString() и конструктор StringBuffer
        StringBuffer bufferFromBuilder = new StringBuffer(builder.toString());
        System.out.println("StringBuilder -> StringBuffer: " + bufferFromBuilder);
    }
}




