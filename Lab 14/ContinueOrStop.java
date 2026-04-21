import java.util.Scanner;

public class ContinueOrStop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String choice;

        System.out.println("=== Управление циклом ===");

        do {
            System.out.println("Выполняется операция...");

            System.out.print("Продолжить? (yes/no): ");
            choice = scanner.nextLine();

            if (!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no")) {
                System.out.println("Введите только yes или no!");
            }

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Программа завершена.");
    }
}