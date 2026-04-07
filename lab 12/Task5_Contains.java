import java.util.Scanner;

public class Task5_Contains {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текст: ");
        String text = scanner.nextLine();

        System.out.print("Введите слово для поиска: ");
        String word = scanner.nextLine();

        boolean result = text.contains(word);

        if (result) {
            System.out.println("Слово найдено");
        } else {
            System.out.println("Слово не найдено");
        }
    }
}