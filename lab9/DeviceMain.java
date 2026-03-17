public class DeviceMain {

    public static void main(String[] args) {

        Laptop laptop = new Laptop("HP", 65, "Intel i7");
        Smartphone smartphone = new Smartphone("Samsung", 15, "Android");
        Tablet tablet = new Tablet("Apple", 20, "iPadOS");

        laptop.displayInfo();
        laptop.turnOn();

        System.out.println("----------------");

        smartphone.displayInfo();
        smartphone.turnOn();

        System.out.println("----------------");

        tablet.displayInfo();
        tablet.turnOn();
    }
}

// Базовый класс
class Device {

    String brand;
    int power; // в ваттах

    Device(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    void turnOn() {
        System.out.println(brand + " is now turned on");
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Power: " + power + "W");
    }
}

// Ноутбук
class Laptop extends Device {

    String processor;

    Laptop(String brand, int power, String processor) {
        super(brand, power);
        this.processor = processor;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Processor: " + processor);
    }

    @Override
    void turnOn() {
        System.out.println(brand + " laptop is booting with " + processor);
    }
}

// Смартфон
class Smartphone extends Device {

    String os;

    Smartphone(String brand, int power, String os) {
        super(brand, power);
        this.os = os;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("OS: " + os);
    }

    @Override
    void turnOn() {
        System.out.println(brand + " smartphone is starting " + os);
    }
}

// Планшет
class Tablet extends Device {

    String os;

    Tablet(String brand, int power, String os) {
        super(brand, power);
        this.os = os;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("OS: " + os);
    }

    @Override
    void turnOn() {
        System.out.println(brand + " tablet is starting " + os);
    }
}