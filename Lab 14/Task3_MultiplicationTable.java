import java.util.Scanner;

public class Task3_MultiplicationTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Таблица умножения ===");
        System.out.print("Введите число: ");

        int n = scanner.nextInt();
        int i = 1;

        do {
            int result = n * i;
            System.out.println(n + " x " + i + " = " + result);
            i++;
        } while (i <= 10);

        System.out.println("Таблица построена.");
    }
}