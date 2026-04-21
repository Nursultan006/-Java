import java.util.Scanner;

public class Task4_MaxDigitInNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Поиск максимальной цифры ===");
        System.out.print("Введите число: ");

        int number = scanner.nextInt();
        number = Math.abs(number);

        int max = 0;

        do {
            int digit = number % 10;
            System.out.println("Цифра: " + digit);

            if (digit > max) {
                max = digit;
            }

            number /= 10;

        } while (number > 0);

        System.out.println("Максимальная цифра: " + max);
    }
}