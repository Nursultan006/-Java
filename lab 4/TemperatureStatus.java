import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите температуру: ");
        int t = sc.nextInt();

        if (t < 0) {
            System.out.println("Холодно");
        } else if (t <= 20) {
            System.out.println("Тепло");
        } else {
            System.out.println("Жарко");
        }
    }
}
