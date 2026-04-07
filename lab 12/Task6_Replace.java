import java.util.Scanner;

public class Task6_Replace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текст: ");
        String text = scanner.nextLine();

        System.out.print("Что заменить: ");
        String oldWord = scanner.nextLine();

        System.out.print("На что заменить: ");
        String newWord = scanner.nextLine();

        String result = text.replace(oldWord, newWord);

        System.out.println("Результат: " + result);
    }
}