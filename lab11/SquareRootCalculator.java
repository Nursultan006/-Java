import java.util.Scanner;

public class SquareRootCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        double number = scanner.nextDouble();

        if (number < 0) {
            System.out.println("Ошибка: нельзя извлечь квадратный корень из отрицательного числа.");
        } else {
            double result = Math.sqrt(number);
            System.out.println("Квадратный корень из " + number + " = " + result);
        }

        scanner.close();
    }
}