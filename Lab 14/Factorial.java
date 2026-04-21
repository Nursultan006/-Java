import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;

        System.out.println("=== Вычисление факториала ===");

        do {
            System.out.print("Введите неотрицательное число: ");
            number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Ошибка! Число должно быть >= 0");
            }

        } while (number < 0);

        int factorial = 1;
        int i = 1;

        do {
            factorial *= i;
            i++;
        } while (i <= number);

        System.out.println("Факториал числа " + number + " = " + factorial);
    }
}