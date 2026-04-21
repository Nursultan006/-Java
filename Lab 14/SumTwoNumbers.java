import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String choice;

        System.out.println("=== Сложение двух чисел ===");

        do {
            System.out.print("Введите первое число: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка! Введите число.");
                scanner.next();
            }
            int a = scanner.nextInt();

            System.out.print("Введите второе число: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка! Введите число.");
                scanner.next();
            }
            int b = scanner.nextInt();

            int sum = a + b;
            System.out.println("Результат: " + sum);

            scanner.nextLine();

            System.out.print("Продолжить? (yes/no): ");
            choice = scanner.nextLine();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Работа программы завершена.");
    }
}