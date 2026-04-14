import java.util.function.Supplier;
import java.util.Random;

public class Task12 {
    public static void main(String[] args) {

        Supplier<Integer> randomSupplier = () -> new Random().nextInt(100);

        System.out.println("Случайные числа:");

        for(int i = 0; i < 5; i++) {
            System.out.println(randomSupplier.get());
        }
    }
}