import java.util.Scanner;

public class Task11_RemoveSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String text = scanner.nextLine();

        String result = text.replace(" ", "");

        System.out.println("Без пробелов: " + result);
    }
}