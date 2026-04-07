import java.util.Scanner;

public class Task8_Equals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первую строку: ");
        String str1 = scanner.nextLine();

        System.out.print("Введите вторую строку: ");
        String str2 = scanner.nextLine();

        if (str1.equals(str2)) {
            System.out.println("Строки равны");
        } else {
            System.out.println("Строки не равны");
        }
    }
}