import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Сумма цифр числа ===");
        System.out.print("Введите число: ");

        int number = scanner.nextInt();
        int original = number;
        int sum = 0;

        do {
            int digit = number % 10;
            System.out.println("Цифра: " + digit);

            sum += digit;
            number /= 10;

        } while (number > 0);

        System.out.println("Сумма цифр числа " + original + " = " + sum);
    }
}