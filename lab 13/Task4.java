import java.util.*;

public class Task4 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        System.out.println("Исходный список: " + numbers);

        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .peek(n -> System.out.println("Квадрат: " + n))
                .toList();

        System.out.println("Новый список квадратов: " + squares);
    }
}