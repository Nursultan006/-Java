import java.util.Scanner;

public class Task2_Case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        String upper = input.toUpperCase();
        String lower = input.toLowerCase();

        System.out.println("Верхний регистр: " + upper);
        System.out.println("Нижний регистр: " + lower);
    }
}