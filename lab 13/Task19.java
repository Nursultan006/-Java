import java.util.*;

public class Task19 {
    public static void main(String[] args) {

        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(3,4),
                Arrays.asList(5,6)
        );

        list.stream()
                .flatMap(x -> x.stream())
                .peek(n -> System.out.println("Элемент: " + n))
                .forEach(System.out::println);
    }
}