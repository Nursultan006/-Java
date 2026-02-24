import java.util.Scanner;

public class EvenCheckTask {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int num = scanner.nextInt();

        if (isEven(num)) {
            System.out.println("Результат: число " + num + " чётное.");
        } else {
            System.out.println("Результат: число " + num + " нечётное.");
        }
    }
}