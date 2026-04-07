import java.util.Scanner;

public class Task9_Split {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку (через запятую): ");
        String text = scanner.nextLine();

        String[] parts = text.split(",");

        System.out.println("Части строки:");
        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
        }
    }
}