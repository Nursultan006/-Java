import java.util.Scanner;

public class Task6_CountEvenDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Подсчёт чётных цифр ===");
        System.out.print("Введите число: ");

        int number = scanner.nextInt();
        number = Math.abs(number);

        int count = 0;

        do {
            int digit = number % 10;

            System.out.println("Цифра: " + digit);

            if (digit % 2 == 0) {
                count++;
                System.out.println("Это чётная цифра!");
            }

            number /= 10;

        } while (number > 0);

        System.out.println("Количество чётных цифр: " + count);
    }
}