import java.util.Scanner;

public class Task14_StartsWith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String text = scanner.nextLine();

        System.out.print("Введите начало строки: ");
        String prefix = scanner.nextLine();

        boolean result = text.startsWith(prefix);

        if (result) {
            System.out.println("Строка начинается с этого слова");
        } else {
            System.out.println("Строка не начинается с этого слова");
        }
    }
}