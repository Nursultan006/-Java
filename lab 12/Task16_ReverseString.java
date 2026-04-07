import java.util.Scanner;

public class Task16_ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String text = scanner.nextLine();

        String reversed = new StringBuilder(text).reverse().toString();

        System.out.println("Перевернутая строка: " + reversed);
    }
}