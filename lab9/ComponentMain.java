public class ComponentMain {

    public static void main(String[] args) {

        CPU cpu = new CPU("Intel Core i7", 8);
        RAM ram = new RAM("Corsair Vengeance", 16);
        GPU gpu = new GPU("NVIDIA RTX 4070", 12);

        cpu.displayInfo();
        cpu.showInfo();

        System.out.println("----------------");

        ram.displayInfo();
        ram.showInfo();

        System.out.println("----------------");

        gpu.displayInfo();
        gpu.showInfo();
    }
}

// Базовый класс
class Component {

    String name;

    Component(String name) {
        this.name = name;
    }

    void displayInfo() {
        System.out.println("Component: " + name);
    }

    void showInfo() {
        System.out.println("General component info");
    }
}

// Процессор
class CPU extends Component {

    int cores;

    CPU(String name, int cores) {
        super(name);
        this.cores = cores;
    }

    @Override
    void showInfo() {
        System.out.println(name + " has " + cores + " cores");
    }
}

// Оперативная память
class RAM extends Component {

    int sizeGB;

    RAM(String name, int sizeGB) {
        super(name);
        this.sizeGB = sizeGB;
    }

    @Override
    void showInfo() {
        System.out.println(name + " size: " + sizeGB + " GB");
    }
}

// Видеокарта
class GPU extends Component {

    int memoryGB;

    GPU(String name, int memoryGB) {
        super(name);
        this.memoryGB = memoryGB;
    }

    @Override
    void showInfo() {
        System.out.println(name + " memory: " + memoryGB + " GB");
    }
}