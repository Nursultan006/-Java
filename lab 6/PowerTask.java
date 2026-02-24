import java.util.Scanner;

public class PowerTask {
    public static int power(int base, int exponent) {
        if (exponent == 0) return 1;
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите основание: ");
        int b = scanner.nextInt();
        System.out.print("Введите степень: ");
        int e = scanner.nextInt();

        System.out.println(b + "^" + e + " = " + power(b, e));
    }
}