import java.util.Scanner;

public class CalculatorMethods {

    public static double add(double a, double b) { return a + b; }
    public static double sub(double a, double b) { return a - b; }
    public static double mul(double a, double b) { return a * b; }

    public static double div(double a, double b) {
        if (b == 0) {
            System.out.println("Ошибка деления на ноль!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите числа: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.print("Операция: ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+': System.out.println(add(a,b)); break;
            case '-': System.out.println(sub(a,b)); break;
            case '*': System.out.println(mul(a,b)); break;
            case '/': System.out.println(div(a,b)); break;
        }

        sc.close();
    }
}