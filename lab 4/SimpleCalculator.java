import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double a = sc.nextDouble();
        System.out.print("Введите второе число: ");
        double b = sc.nextDouble();
        System.out.print("Введите операцию (+, -, *, /): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+' -> System.out.println("Результат: " + (a + b));
            case '-' -> System.out.println("Результат: " + (a - b));
            case '*' -> System.out.println("Результат: " + (a * b));
            case '/' -> {
                if (b != 0)
                    System.out.println("Результат: " + (a / b));
                else
                    System.out.println("Деление на ноль невозможно");
            }
            default -> System.out.println("Неизвестная операция");
        }
    }
}
