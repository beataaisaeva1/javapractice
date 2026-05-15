class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // переопределение метода equals()
    @Override
    public boolean equals(Object obj) {
        // проверка ссылки на самого себя
        if (this == obj) {
            return true;
        }

        // проверка на null
        if (obj == null) {
            return false;
        }

        // проверка типа объекта
        if (getClass() != obj.getClass()) {
            return false;
        }

        // приведение типа
        Student other = (Student) obj;

        // сравнение полей объектов
        return age == other.age && name.equals(other.name);
    }
}

public class practice20 {
    public static void main(String[] args) {
        Student s1 = new Student("Анна", 20);
        Student s2 = new Student("Анна", 20);
        System.out.println(s1.equals(s2));
    }
}