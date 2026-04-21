public class EvenNumbersSum {
    public static void main(String[] args) {

        int sum = 0;
        int i = 2;

        System.out.println("=== Сумма чётных чисел до 100 ===");

        do {
            System.out.println("Добавляем: " + i);
            sum += i;
            i += 2;

        } while (i <= 100);

        System.out.println("Итоговая сумма: " + sum);
    }
}