public class TransportMain {

    public static void main(String[] args) {

        Car car = new Car("Toyota", 180, 4);
        Train train = new Train("Talgo", 250, 10);
        Airplane airplane = new Airplane("Boeing", 900, 12000);

        car.displayInfo();
        car.move();

        train.displayInfo();
        train.move();

        airplane.displayInfo();
        airplane.move();
    }
}

// Базовый класс
class Transport {

    String name;
    int speed;

    Transport(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Speed: " + speed);
    }

    void move() {
        System.out.println("Transport is moving");
    }
}

// Машина
class Car extends Transport {

    int wheels;

    Car(String name, int speed, int wheels) {
        super(name, speed);
        this.wheels = wheels;
    }

    @Override
    void move() {
        System.out.println(name + " drives on the road with " + wheels + " wheels");
    }
}

// Поезд
class Train extends Transport {

    int wagons;

    Train(String name, int speed, int wagons) {
        super(name, speed);
        this.wagons = wagons;
    }

    @Override
    void move() {
        System.out.println(name + " moves on rails with " + wagons + " wagons");
    }
}

// Самолет
class Airplane extends Transport {

    int altitude;

    Airplane(String name, int speed, int altitude) {
        super(name, speed);
        this.altitude = altitude;
    }

    @Override
    void move() {
        System.out.println(name + " flies at altitude " + altitude + " meters");
    }
}