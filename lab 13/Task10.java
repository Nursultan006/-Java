import java.util.*;

public class Task10 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Список: " + numbers);

        Optional<Integer> min = numbers.stream().min(Integer::compare);

        int result = min.orElse(0);

        System.out.println("Минимум (или 0): " + result);

        min.ifPresentOrElse(
                n -> System.out.println("Нашли: " + n),
                () -> System.out.println("Список пуст!")
        );
    }
}