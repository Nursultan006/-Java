import java.util.function.Function;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = sc.nextLine();

        Function<String, String> toUpper = s -> s.toUpperCase();

        String result = toUpper.apply(input);

        System.out.println("Верхний регистр: " + result);

        // Дополнительно
        System.out.println("Длина строки: " + result.length());
    }
}