public class VehicleMain {

    public static void main(String[] args) {

        Bike bike = new Bike("Trek", 21);
        Bus bus = new Bus("Mercedes", 80);
        Taxi taxi = new Taxi("Toyota Prius", 60);

        bike.displayInfo();
        bike.startEngine();

        System.out.println("----------------");

        bus.displayInfo();
        bus.startEngine();

        System.out.println("----------------");

        taxi.displayInfo();
        taxi.startEngine();
    }
}

// Базовый класс
class Vehicle {

    String name;
    int maxSpeed;

    Vehicle(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    void startEngine() {
        System.out.println(name + " engine started");
    }

    void displayInfo() {
        System.out.println("Vehicle: " + name + ", Max speed: " + maxSpeed + " km/h");
    }
}

// Велосипед
class Bike extends Vehicle {

    Bike(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    void startEngine() {
        System.out.println(name + " doesn't have an engine, it is pedaled!");
    }
}

// Автобус
class Bus extends Vehicle {

    Bus(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    void startEngine() {
        System.out.println(name + " bus engine started, ready to transport passengers");
    }
}

// Такси
class Taxi extends Vehicle {

    Taxi(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    void startEngine() {
        System.out.println(name + " taxi engine started, ready for ride");
    }
}