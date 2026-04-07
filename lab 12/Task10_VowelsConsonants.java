import java.util.Scanner;

public class Task10_VowelsConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String text = scanner.nextLine().toLowerCase();

        int vowels = 0;
        int consonants = 0;

        String vowelLetters = "aeiouаеёиоуыэюя";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (vowelLetters.indexOf(ch) != -1) {
                vowels++;
            } else if (Character.isLetter(ch)) {
                consonants++;
            }
        }

        System.out.println("Гласные: " + vowels);
        System.out.println("Согласные: " + consonants);
    }
}