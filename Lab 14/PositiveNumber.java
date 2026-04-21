import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("=== Ввод положительного числа ===");

        do {
            System.out.print("Введите число: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка! Введите целое число.");
                scanner.next();
            }

            number = scanner.nextInt();

            if (number <= 0) {
                System.out.println("Число должно быть больше 0!");
            }

        } while (number <= 0);

        System.out.println("Корректное число: " + number);
    }
}