import java.util.*;

public class Task18 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,2,3,4,4,5);

        numbers.stream()
                .distinct()
                .peek(n -> System.out.println("Уникальный: " + n))
                .limit(3)
                .forEach(n -> System.out.println("Итог: " + n));
    }
}