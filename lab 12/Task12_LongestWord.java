import java.util.Scanner;

public class Task12_LongestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String text = scanner.nextLine();

        String[] words = text.split(" ");
        String longestWord = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }

        System.out.println("Самое длинное слово: " + longestWord);
    }
}