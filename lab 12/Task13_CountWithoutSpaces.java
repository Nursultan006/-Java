import java.util.Scanner;

public class Task13_CountWithoutSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String text = scanner.nextLine();

        String noSpaces = text.replace(" ", "");
        int count = noSpaces.length();

        System.out.println("Количество символов без пробелов: " + count);
    }
}