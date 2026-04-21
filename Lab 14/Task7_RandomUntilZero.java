public class Task7_RandomUntilZero {
    public static void main(String[] args) {

        System.out.println("=== Генерация случайных чисел ===");

        int number;
        int attempts = 0;

        do {
            number = (int)(Math.random() * 10);
            attempts++;

            System.out.println("Сгенерировано число: " + number);

        } while (number != 0);

        System.out.println("Выпало 0!");
        System.out.println("Количество попыток: " + attempts);
    }
}