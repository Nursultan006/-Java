import java.util.function.BinaryOperator;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = sc.nextInt();

        System.out.print("Введите второе число: ");
        int b = sc.nextInt();

        // Лямбда для сложения
        BinaryOperator<Integer> sum = (x, y) -> x + y;

        int result = sum.apply(a, b);

        System.out.println("Результат сложения: " + result);

        // Дополнительно
        System.out.println("Проверка: " + a + " + " + b + " = " + result);
    }
}