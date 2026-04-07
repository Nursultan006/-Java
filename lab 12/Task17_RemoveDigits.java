import java.util.Scanner;

public class Task17_RemoveDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String text = scanner.nextLine();

        String result = text.replaceAll("\\d", "");

        System.out.println("Без цифр: " + result);
    }
}