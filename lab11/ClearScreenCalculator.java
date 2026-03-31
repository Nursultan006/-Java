import java.util.Scanner;

public class ClearScreenCalculator {
    public static void clearScreen() {
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Калькулятор");
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        clearScreen();

        System.out.println("После очистки экрана:");
        System.out.println("Сумма чисел: " + (num1 + num2));

        scanner.close();
    }
}