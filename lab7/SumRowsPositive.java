public static void sumRowsPositive() {
    int[][] B = new int[5][5];
    int[] A = new int[5];

    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            B[i][j] = (int)(Math.random() * 20 - 10);
            if (B[i][j] > 0) A[i] += B[i][j];
        }
    }
}