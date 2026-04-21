import java.util.Scanner;

public class Task9_PasswordLengthCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String password;

        System.out.println("=== Проверка пароля ===");

        do {
            System.out.print("Введите пароль (минимум 6 символов): ");
            password = scanner.nextLine();

            if (password.length() < 6) {
                System.out.println("Пароль слишком короткий!");
            }

        } while (password.length() < 6);

        System.out.println("Пароль принят.");
    }
}