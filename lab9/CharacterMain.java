public class CharacterMain {

    public static void main(String[] args) {

        Warrior warrior = new Warrior("Thor", 150);
        Mage mage = new Mage("Gandalf", 200);
        Archer archer = new Archer("Legolas", 120);

        warrior.displayInfo();
        warrior.attack();

        System.out.println("----------------");

        mage.displayInfo();
        mage.attack();

        System.out.println("----------------");

        archer.displayInfo();
        archer.attack();
    }
}

// Базовый класс
class Character {

    String name;
    int health;

    Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    void displayInfo() {
        System.out.println("Character: " + name + ", Health: " + health);
    }

    void attack() {
        System.out.println(name + " attacks the enemy");
    }
}

// Воин
class Warrior extends Character {

    Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    void attack() {
        System.out.println(name + " strikes with sword!");
    }
}

// Маг
class Mage extends Character {

    Mage(String name, int health) {
        super(name, health);
    }

    @Override
    void attack() {
        System.out.println(name + " casts a powerful spell!");
    }
}

// Лучник
class Archer extends Character {

    Archer(String name, int health) {
        super(name, health);
    }

    @Override
    void attack() {
        System.out.println(name + " shoots arrows with precision!");
    }
}