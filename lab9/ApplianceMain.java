public class ApplianceMain {

    public static void main(String[] args) {

        Refrigerator fridge = new Refrigerator("Samsung", 300);
        WashingMachine washer = new WashingMachine("LG", 500);
        Microwave microwave = new Microwave("Panasonic", 1200);

        fridge.displayInfo();
        fridge.operate();

        System.out.println("----------------");

        washer.displayInfo();
        washer.operate();

        System.out.println("----------------");

        microwave.displayInfo();
        microwave.operate();
    }
}

// Базовый класс
class Appliance {

    String brand;
    int power; // Ватт

    Appliance(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    void displayInfo() {
        System.out.println("Appliance: " + brand + ", Power: " + power + "W");
    }

    void operate() {
        System.out.println(brand + " is operating");
    }
}

// Холодильник
class Refrigerator extends Appliance {

    Refrigerator(String brand, int power) {
        super(brand, power);
    }

    @Override
    void operate() {
        System.out.println(brand + " refrigerator is cooling food");
    }
}

// Стиральная машина
class WashingMachine extends Appliance {

    WashingMachine(String brand, int power) {
        super(brand, power);
    }

    @Override
    void operate() {
        System.out.println(brand + " washing machine is washing clothes");
    }
}

// Микроволновка
class Microwave extends Appliance {

    Microwave(String brand, int power) {
        super(brand, power);
    }

    @Override
    void operate() {
        System.out.println(brand + " microwave is heating food");
    }
}