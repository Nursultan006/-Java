import java.util.Scanner;

public class Task7_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String text = scanner.nextLine();

        String reversed = new StringBuilder(text).reverse().toString();

        if (text.equalsIgnoreCase(reversed)) {
            System.out.println("Это палиндром");
        } else {
            System.out.println("Это не палиндром");
        }
    }
}