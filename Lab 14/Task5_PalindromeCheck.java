import java.util.Scanner;

public class Task5_PalindromeCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Проверка на палиндром ===");
        System.out.print("Введите число: ");

        int number = scanner.nextInt();
        int original = Math.abs(number);
        int temp = original;
        int reversed = 0;

        do {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;

            System.out.println("Формируем число: " + reversed);

            temp /= 10;
        } while (temp > 0);

        if (original == reversed) {
            System.out.println("Число является палиндромом.");
        } else {
            System.out.println("Число НЕ является палиндромом.");
        }
    }
}