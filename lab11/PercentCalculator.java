import java.util.Scanner;

public class PercentCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число a (процент): ");
        double a = scanner.nextDouble();

        System.out.print("Введите число b: ");
        double b = scanner.nextDouble();

        double result = (a / 100) * b;

        System.out.println(a + "% от " + b + " = " + result);

        scanner.close();
    }
}