import java.util.Scanner;

public class Task1_SumFrom1ToN {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("=== Сумма чисел от 1 до N ===");

        do {
            System.out.print("Введите положительное число N: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка! Введите число.");
                scanner.next();
            }

            n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("N должно быть больше 0!");
            }

        } while (n <= 0);

        int sum = 0;
        int i = 1;

        do {
            System.out.println("Добавляем: " + i);
            sum += i;
            i++;
        } while (i <= n);

        System.out.println("Итоговая сумма: " + sum);
    }
}