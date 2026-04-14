import java.util.*;

public class Task3 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        System.out.println("Исходный список: " + numbers);

        System.out.println("Нечетные числа:");

        numbers.stream()
                .filter(n -> n % 2 != 0)
                .peek(n -> System.out.println("Проходит фильтр: " + n))
                .forEach(n -> System.out.println("Результат: " + n));

        long count = numbers.stream().filter(n -> n % 2 != 0).count();
        System.out.println("Количество нечетных: " + count);
    }
}