public class Numbers1to10 {
    public static void main(String[] args) {

        int start = 1;
        int end = 10;
        int i = start;

        System.out.println("Вывод чисел от " + start + " до " + end + ":");

        do {
            System.out.println("Текущее значение: " + i);
            i++;
        } while (i <= end);

        System.out.println("Цикл завершён.");
    }
}