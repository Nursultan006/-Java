public class AnimalMain {

    public static void main(String[] args) {

        Lion lion = new Lion("Simba", 5);
        Elephant elephant = new Elephant("Dumbo", 10);
        Monkey monkey = new Monkey("George", 3);

        lion.displayInfo();
        lion.makeSound();

        System.out.println("----------------");

        elephant.displayInfo();
        elephant.makeSound();

        System.out.println("----------------");

        monkey.displayInfo();
        monkey.makeSound();
    }
}

// Базовый класс
class Animal {

    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    void makeSound() {
        System.out.println("This animal makes a sound.");
    }
}

// Лев
class Lion extends Animal {

    Lion(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Roar!");
    }
}

// Слон
class Elephant extends Animal {

    Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Trumpet!");
    }
}

// Обезьяна
class Monkey extends Animal {

    Monkey(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Oo-oo-aa-aa!");
    }
}