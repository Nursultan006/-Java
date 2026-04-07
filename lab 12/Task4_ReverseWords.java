import java.util.Scanner;

public class Task4_ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        System.out.print("Результат: ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            String reversedWord = new StringBuilder(word).reverse().toString();

            System.out.print(reversedWord + " ");
        }
    }
}