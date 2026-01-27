// Базовый класс
class Person {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Человек: " + name + ", Возраст: " + age);
    }
}

// Производный класс (Наследование - Задача 4)
class Student extends Person {
    String group;

    // Переопределение метода (Задача 5)
    @Override
    void displayInfo() {
        System.out.println("Студент: " + name + ", Группа: " + group);
    }
}

public class MainApp {
    public static void main(String[] args) {
        // Демонстрация полиморфизма (Задача 5)
        Person myStudent = new Student();
        myStudent.name = "Николай";
        myStudent.age = 20;
        ((Student) myStudent).group = "ИС-101";

        // Вызовется переопределенный метод
        myStudent.displayInfo();
    }
}