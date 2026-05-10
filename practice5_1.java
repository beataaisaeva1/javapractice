public class practice5_1 {
    public static void main(String[] args) {
        // =, +=, -=, *=, /=, %=
        int a = 10;
        a += 5;
        a -= 3;
        a *= 2;
        a /= 4;
        a %= 4;
        System.out.println("a = " + a);

        // Оператор ?:
        int age = 18;
        String result = age >= 18 ? "Совершеннолетний" : "Несовершеннолетний";
        System.out.println(result);

        // || и &&
        boolean x = true;
        boolean y = false;
        System.out.println(x || y);
        System.out.println(x && y);
        // |, ^, &
        System.out.println(x | y);
        System.out.println(x ^ y);
        System.out.println(x & y);

        // Побитовые операции
        int n1 = 5;
        int n2 = 3;
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);
        System.out.println(n1 & n2);

        // ==, >, >=, <, <=
        int p = 10;
        int q = 20;
        System.out.println(p == q);
        System.out.println(p > q);
        System.out.println(p >= q);
        System.out.println(p < q);
        System.out.println(p <= q);

        // >>, >>>, <<
        int number = 8;
        System.out.println(number >> 1);
        System.out.println(number >>> 1);
        System.out.println(number << 1);

        // + и -
        int sum = 7 + 3;
        int difference = 7 - 3;
        System.out.println(sum);
        System.out.println(difference);

        // * / %
        int multiplication = 6 * 2;
        int division = 6 / 2;
        int remainder = 7 % 2;
        System.out.println(multiplication);
        System.out.println(division);
        System.out.println(remainder);

        // ++ и -- (префиксная и постфиксная формы)
        int k = 5;
        System.out.println(++k);
        System.out.println(k++);
        System.out.println(k);
        int m = 5;
        System.out.println(--m);
        System.out.println(m--);
        System.out.println(m);

        // ~ и !
        int z = 5;
        boolean flag = true;
        System.out.println(~z);
        System.out.println(!flag);

        // ( ) и [ ]
        int example = (2 + 3) * 4;
        int[] array = {10, 20, 30};
        System.out.println(example);
        System.out.println(array[1]);

        // String и оператор +
        String name = "Беата";
        String greeting = "Привет, " + name;
        System.out.println(greeting);

        // String и +=
        String text = "Java";
        text += " язык программирования";
        System.out.println(text);

        // String и ==
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2);
    }
}