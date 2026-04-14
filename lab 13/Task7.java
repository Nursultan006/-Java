import java.util.function.Function;
import java.util.*;

public class Task7 {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("java", "stream", "lambda");

        Function<String, String> capitalize =
                s -> s.substring(0,1).toUpperCase() + s.substring(1);

        words.stream()
                .map(capitalize)
                .peek(s -> System.out.println("Обработано: " + s))
                .forEach(System.out::println);
    }
}