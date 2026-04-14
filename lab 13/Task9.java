import java.util.*;

public class Task9 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        System.out.println("Вывод через Method Reference:");
        numbers.forEach(System.out::println);

        System.out.println("Дополнительно через lambda:");
        numbers.forEach(n -> System.out.println("Число: " + n));
    }
}