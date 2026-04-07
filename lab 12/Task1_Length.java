import java.util.Scanner;

public class Task1_Length {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        int length = input.length();

        System.out.println("Длина строки: " + length);
    }
}