public static void productDiagonal() {
    int[][] C = new int[5][5];
    int product = 1;

    for (int i = 0; i < 5; i++) {
        C[i][i] = (int)(Math.random() * 20 - 10);
        if (C[i][i] > 0) product *= C[i][i];
    }
}