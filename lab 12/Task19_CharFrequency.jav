import java.util.Scanner;

public class Task19_CharFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            int count = 0;

            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == currentChar) {
                    count++;
                }
            }

            System.out.println(currentChar + " : " + count);
        }
    }
}