import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String correctPassword = "12345";
        String input;
        int attempts = 0;

        System.out.println("=== Проверка пароля ===");

        do {
            System.out.print("Введите пароль: ");
            input = scanner.nextLine();
            attempts++;

            if (!input.equals(correctPassword)) {
                System.out.println("Неверный пароль!");
            }

        } while (!input.equals(correctPassword));

        System.out.println("Доступ разрешён!");
        System.out.println("Попыток: " + attempts);
    }
}