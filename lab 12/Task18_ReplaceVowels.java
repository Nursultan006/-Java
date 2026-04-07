import java.util.Scanner;

public class Task18_ReplaceVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String text = scanner.nextLine();

        String result = text.replaceAll("[aeiouAEIOUаеёиоуыэюяАЕЁИОУЫЭЮЯ]", "*");

        System.out.println("Результат: " + result);
    }
}