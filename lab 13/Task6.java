import java.util.*;

public class Task6 {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Java", "Stream", "API", "Lambda", "Programming");

        System.out.println("Исходный список:");
        words.forEach(System.out::println);

        System.out.println("\nСортировка по длине:");

        words.stream()
                .peek(w -> System.out.println("До сортировки: " + w))
                .sorted(Comparator.comparingInt(String::length))
                .peek(w -> System.out.println("После обработки: " + w))
                .forEach(w -> System.out.println("Результат: " + w));
    }
}