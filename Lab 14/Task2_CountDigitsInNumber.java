import java.util.Scanner;

public class Task2_CountDigitsInNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Подсчёт количества цифр ===");
        System.out.print("Введите число: ");

        int number = scanner.nextInt();
        number = Math.abs(number);

        int count = 0;

        do {
            count++;
            System.out.println("Обрабатываем цифру...");
            number /= 10;
        } while (number > 0);

        System.out.println("Количество цифр: " + count);
    }
}