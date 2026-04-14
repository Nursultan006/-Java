import java.util.*;
import java.util.stream.*;

public class Task16 {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Ali",20,85),
                new Student("Dana",22,90),
                new Student("Maks",20,70)
        );

        Map<Integer, List<Student>> grouped =
                students.stream()
                        .collect(Collectors.groupingBy(s -> s.age));

        grouped.forEach((age, list) -> {
            System.out.println("Возраст: " + age);
            list.forEach(System.out::println);
        });
    }
}