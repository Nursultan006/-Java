import java.util.*;

public class Task13 {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Ali",20,85),
                new Student("Dana",22,90),
                new Student("Maks",19,70)
        );

        System.out.println("До сортировки:");
        students.forEach(System.out::println);

        System.out.println("\nПосле сортировки по возрасту:");

        students.stream()
                .sorted(Comparator.comparing(s -> s.age))
                .peek(s -> System.out.println("Обрабатывается: " + s))
                .forEach(System.out::println);
    }
}