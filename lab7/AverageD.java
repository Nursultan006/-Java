public static void averageD() {
    int[] D = new int[17];
    double sum = 0;

    for (int i = 0; i < 17; i++) {
        D[i] = (int)(Math.random() * 50);
        sum += D[i];
    }

    System.out.println("Среднее арифметическое D: " + sum / 17);
}