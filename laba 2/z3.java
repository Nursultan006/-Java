public class Task3 {
    // Поле класса (Instance variable) - видно во всем классе
    static String classScope = "Я видна всему классу";

    public static void main(String[] args) {
        // Локальная переменная - видна только внутри метода main
        String localScope = "Я видна только в методе main";

        System.out.println(classScope);
        System.out.println(localScope);
    }
}