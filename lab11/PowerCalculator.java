import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число x: ");
        double x = scanner.nextDouble();

        System.out.print("Введите степень y: ");
        double y = scanner.nextDouble();

        double result = Math.pow(x, y);

        System.out.println("Результат: " + x + "^" + y + " = " + result);

        scanner.close();
    }
}