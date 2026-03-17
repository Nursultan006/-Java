public class ProductMain {

    public static void main(String[] args) {

        Food apple = new Food("Apple", 120);
        Electronics laptop = new Electronics("Laptop", 150000);
        Clothes tshirt = new Clothes("T-Shirt", 2500);

        apple.displayInfo();
        apple.showPrice();

        System.out.println("----------------");

        laptop.displayInfo();
        laptop.showPrice();

        System.out.println("----------------");

        tshirt.displayInfo();
        tshirt.showPrice();
    }
}

// Базовый класс
class Product {

    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void displayInfo() {
        System.out.println("Product: " + name);
    }

    void showPrice() {
        System.out.println("Price: " + price + " KZT");
    }
}

// Еда
class Food extends Product {

    Food(String name, double price) {
        super(name, price);
    }
}

// Электроника
class Electronics extends Product {

    Electronics(String name, double price) {
        super(name, price);
    }
}

// Одежда
class Clothes extends Product {

    Clothes(String name, double price) {
        super(name, price);
    }
}