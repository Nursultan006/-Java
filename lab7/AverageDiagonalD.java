public static void averageDiagonal() {
    int[][] D = new int[7][7];
    double sum = 0;

    for (int i = 0; i < 7; i++) {
        D[i][i] = (int)(Math.random() * 20);
        sum += D[i][i];
    }

    System.out.println("Среднее диагонали: " + sum / 7);
}