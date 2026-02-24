import java.util.Scanner;

public class lab6 {

    /**
     * Метод вычисления площади прямоугольника
     * @param width ширина
     * @param height высота
     * @return площадь
     */
    public static double rectangleArea(double width, double height) {
        return width * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Задание 1: Площадь прямоугольника ---");
        
        System.out.print("Введите значение ширины: ");
        double w = scanner.nextDouble();
        
        System.out.print("Введите значение высоты: ");
        double h = scanner.nextDouble();

        // Вызов метода и сохранение результата
        double area = rectangleArea(w, h);

        // Вывод результата
        System.out.println("Площадь прямоугольника со сторонами " + w + " и " + h + " равна: " + area);
        
        scanner.close();
    }
}