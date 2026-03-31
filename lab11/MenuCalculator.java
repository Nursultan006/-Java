import java.util.Scanner;

public class MenuCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите операцию:");
        System.out.println("1 – сложение");
        System.out.println("2 – вычитание");
        System.out.println("3 – умножение");
        System.out.println("4 – деление");
        System.out.print("Ваш выбор: ");

        int choice = scanner.nextInt();

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Результат: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Результат: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Результат: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Результат: " + (num1 / num2));
                } else {
                    System.out.println("Ошибка: деление на ноль.");
                }
                break;
            default:
                System.out.println("Неверный выбор.");
        }

        scanner.close();
    }
}