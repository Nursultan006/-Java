import java.util.Scanner;

public class Task3_WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        int count = words.length;

        System.out.println("Количество слов: " + count);
    }
}