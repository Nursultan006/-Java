import java.util.*;

public class Task20 {
    public static void main(String[] args) {

        List<Integer> orders = Arrays.asList(500,1500,2000,700,3000);

        orders.stream()
                .filter(o -> o > 1000)
                .peek(o -> System.out.println("Подходит заказ: " + o))
                .sorted()
                .forEach(o -> System.out.println("К оплате: " + o));

        double average = orders.stream()
                .filter(o -> o > 1000)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println("Средний чек: " + average);
    }
}