import java.util.Scanner;

public class EngineeringCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Инженерный калькулятор:");
        System.out.println("1 - sin");
        System.out.println("2 - cos");
        System.out.println("3 - tan");
        System.out.print("Выберите операцию: ");
        int choice = scanner.nextInt();

        System.out.print("Введите угол в радианах: ");
        double angle = scanner.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("sin(" + angle + ") = " + Math.sin(angle));
                break;
            case 2:
                System.out.println("cos(" + angle + ") = " + Math.cos(angle));
                break;
            case 3:
                System.out.println("tan(" + angle + ") = " + Math.tan(angle));
                break;
            default:
                System.out.println("Неверный выбор.");
        }

        scanner.close();
    }
}