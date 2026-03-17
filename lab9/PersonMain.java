public class PersonMain {

    public static void main(String[] args) {

        Student student = new Student("Ali", 19, "Computer Science");
        Teacher teacher = new Teacher("Aigerim", 35, "Mathematics");
        Administrator admin = new Administrator("Dias", 40, "Admissions");

        student.displayInfo();
        student.study();

        System.out.println("-------------------");

        teacher.displayInfo();
        teacher.teach();

        System.out.println("-------------------");

        admin.displayInfo();
        admin.manage();
    }
}

// Базовый класс
class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Студент
class Student extends Person {

    String major;

    Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    void study() {
        System.out.println(name + " studies " + major);
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Major: " + major);
    }
}

// Преподаватель
class Teacher extends Person {

    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void teach() {
        System.out.println(name + " teaches " + subject);
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }
}

// Администратор
class Administrator extends Person {

    String department;

    Administrator(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void manage() {
        System.out.println(name + " manages " + department + " department");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}