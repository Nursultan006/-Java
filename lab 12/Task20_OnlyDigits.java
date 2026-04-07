import java.util.Scanner;

public class Task20_OnlyDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String text = scanner.nextLine();

        boolean isOnlyDigits = text.matches("\\d+");

        if (isOnlyDigits) {
            System.out.println("Строка содержит только цифры");
        } else {
            System.out.println("Строка содержит не только цифры");
        }
    }
}