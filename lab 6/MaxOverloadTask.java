public class MaxOverloadTask {
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static double max(double a, double b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        System.out.println("Максимум из целых (42, 13): " + max(42, 13));
        System.out.println("Максимум из дробных (3.14, 5.55): " + max(3.14, 5.55));
    }
}