import java.util.*;

public class Task8 {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Java", "StreamAPI", "Code", "Programming");

        System.out.println("Фильтр строк > 5:");

        words.stream()
                .filter(s -> s.length() > 5)
                .peek(s -> System.out.println("Подходит: " + s))
                .forEach(System.out::println);

        long count = words.stream().filter(s -> s.length() > 5).count();
        System.out.println("Количество: " + count);
    }
}