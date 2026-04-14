import java.util.*;

public class Task5 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 5, 25, 8, 30);

        System.out.println("Список: " + numbers);

        Optional<Integer> max = numbers.stream()
                .peek(n -> System.out.println("Проверяем: " + n))
                .max(Integer::compare);

        max.ifPresent(m -> System.out.println("Максимум: " + m));

        int min = numbers.stream().min(Integer::compare).orElse(0);
        System.out.println("Минимум: " + min);
    }
}