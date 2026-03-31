import java.util.ArrayList;
import java.util.Scanner;

public class HistoryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();
        String answer = "yes";

        while (answer.equalsIgnoreCase("yes")) {
            System.out.print("Введите первое число: ");
            double num1 = scanner.nextDouble();

            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();

            System.out.print("Выберите операцию (+, -, *, /): ");
            char operation = scanner.next().charAt(0);

            String record = "";

            switch (operation) {
                case '+':
                    record = num1 + " + " + num2 + " = " + (num1 + num2);
                    break;
                case '-':
                    record = num1 + " - " + num2 + " = " + (num1 - num2);
                    break;
                case '*':
                    record = num1 + " * " + num2 + " = " + (num1 * num2);
                    break;
                case '/':
                    if (num2 != 0) {
                        record = num1 + " / " + num2 + " = " + (num1 / num2);
                    } else {
                        record = "Ошибка: деление на ноль";
                    }
                    break;
                default:
                    record = "Неверная операция";
            }

            history.add(record);
            System.out.println(record);

            System.out.print("Продолжить? (yes/no): ");
            answer = scanner.next();
        }

        System.out.println("\nИстория вычислений:");
        for (String item : history) {
            System.out.println(item);
        }

        scanner.close();
    }
}