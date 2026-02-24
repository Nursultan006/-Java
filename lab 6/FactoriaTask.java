import java.util.Scanner;

public class FactorialTask {
    public static long factorial(int n) {
        if (n < 0) {
            System.out.println("Ошибка: число меньше нуля.");
            return -1;
        }
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для факториала: ");
        int number = scanner.nextInt();
        
        long result = factorial(number);
        if (result != -1) {
            System.out.println(number + "! = " + result);
        }
    }
}