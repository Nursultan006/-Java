public class InstrumentMain {

    public static void main(String[] args) {

        Guitar guitar = new Guitar("Fender", 6);
        Piano piano = new Piano("Yamaha", 88);
        Drums drums = new Drums("Pearl", 5);

        guitar.displayInfo();
        guitar.playSound();

        System.out.println("----------------");

        piano.displayInfo();
        piano.playSound();

        System.out.println("----------------");

        drums.displayInfo();
        drums.playSound();
    }
}

// Базовый класс
class Instrument {

    String brand;

    Instrument(String brand) {
        this.brand = brand;
    }

    void displayInfo() {
        System.out.println("Instrument: " + brand);
    }

    void playSound() {
        System.out.println(brand + " is playing sound");
    }
}

// Гитара
class Guitar extends Instrument {

    int strings;

    Guitar(String brand, int strings) {
        super(brand);
        this.strings = strings;
    }

    @Override
    void playSound() {
        System.out.println(brand + " guitar with " + strings + " strings is playing sound");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Strings: " + strings);
    }
}

// Пианино
class Piano extends Instrument {

    int keys;

    Piano(String brand, int keys) {
        super(brand);
        this.keys = keys;
    }

    @Override
    void playSound() {
        System.out.println(brand + " piano with " + keys + " keys is playing sound");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Keys: " + keys);
    }
}

// Барабаны
class Drums extends Instrument {

    int pieces;

    Drums(String brand, int pieces) {
        super(brand);
        this.pieces = pieces;
    }

    @Override
    void playSound() {
        System.out.println(brand + " drum set with " + pieces + " pieces is playing sound");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Pieces: " + pieces);
    }
}