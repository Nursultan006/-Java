import java.util.Scanner;

public class Task10_FindMinNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Поиск минимального числа ===");

        System.out.print("Введите первое число: ");
        int min = scanner.nextInt();
        scanner.nextLine();

        String choice;

        do {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();
            scanner.nextLine();

            if (number < min) {
                System.out.println("Новое минимальное найдено: " + number);
                min = number;
            }

            System.out.print("Продолжить? (yes/no): ");
            choice = scanner.nextLine();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Минимальное число: " + min);
    }
}