import java.util.function.Consumer;

public class Task11 {
    public static void main(String[] args) {

        Consumer<String> printer = s -> {
            System.out.println("Вывод строки:");
            System.out.println(s);
        };

        printer.accept("Hello Java");

        // Дополнительно
        printer.accept("Lambda работает!");
    }
}