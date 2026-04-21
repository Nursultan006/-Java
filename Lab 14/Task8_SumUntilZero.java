import java.util.Scanner;

public class Task8_SumUntilZero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;
        int count = 0;

        System.out.println("=== Сумма чисел до 0 ===");

        do {
            System.out.print("Введите число (0 для выхода): ");
            number = scanner.nextInt();

            sum += number;
            count++;

        } while (number != 0);

        System.out.println("Всего чисел введено: " + (count - 1));
        System.out.println("Сумма: " + sum);
    }
}