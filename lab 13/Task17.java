import java.util.*;

public class Task17 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        int sum = numbers.stream()
                .peek(n -> System.out.println("Добавляем: " + n))
                .reduce(0, Integer::sum);

        System.out.println("Сумма: " + sum);
    }
}