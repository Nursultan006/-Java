import java.util.Scanner;

public class ExpressionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();

        System.out.print("Введите оператор (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();

        double result;

        switch (op) {
            case '+':
                result = a + b;
                System.out.println("Результат: " + result);
                break;
            case '-':
                result = a - b;
                System.out.println("Результат: " + result);
                break;
            case '*':
                result = a * b;
                System.out.println("Результат: " + result);
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                    System.out.println("Результат: " + result);
                } else {
                    System.out.println("Ошибка: деление на ноль.");
                }
                break;
            default:
                System.out.println("Неверный оператор.");
        }

        scanner.close();
    }
}