import java.util.*;

public class Task14 {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Ali",20,85),
                new Student("Dana",22,90),
                new Student("Maks",19,70),
                new Student("Aruzhan",21,95)
        );

        students.stream()
                .filter(s -> s.grade > 80)
                .peek(s -> System.out.println("Прошел фильтр: " + s))
                .sorted(Comparator.comparing(s -> s.name))
                .forEach(System.out::println);
    }
}