public class EmployeeMain {

    public static void main(String[] args) {

        Manager manager = new Manager("Ali", 3000, "IT");
        Developer developer = new Developer("Aruzhan", 2500, "Java");
        Designer designer = new Designer("Dias", 2200, "UI/UX");

        manager.displayInfo();
        manager.work();

        developer.displayInfo();
        developer.work();

        designer.displayInfo();
        designer.work();
    }
}

// Базовый класс
class Employee {

    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }

    void work() {
        System.out.println(name + " is working...");
    }
}

// Менеджер
class Manager extends Employee {

    String department;

    Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    void work() {
        System.out.println(name + " manages the " + department + " department");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

// Разработчик
class Developer extends Employee {

    String programmingLanguage;

    Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void work() {
        System.out.println(name + " writes code in " + programmingLanguage);
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Language: " + programmingLanguage);
    }
}

// Дизайнер
class Designer extends Employee {

    String designType;

    Designer(String name, double salary, String designType) {
        super(name, salary);
        this.designType = designType;
    }

    @Override
    void work() {
        System.out.println(name + " creates " + designType + " designs");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Design type: " + designType);
    }
}