import java.util.*;

public class Task15 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        numbers.stream()
                .filter(n -> n > 2)
                .peek(n -> System.out.println("После filter: " + n))
                .map(n -> n * 2)
                .peek(n -> System.out.println("После map: " + n))
                .sorted()
                .forEach(n -> System.out.println("Итог: " + n));
    }
}