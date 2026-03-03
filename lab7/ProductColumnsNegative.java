public static void productColumnsNegative() {
    double[][] A = new double[12][6];
    double[] product = new double[6];

    for (int j = 0; j < 6; j++) product[j] = 1;

    for (int i = 0; i < 12; i++) {
        for (int j = 0; j < 6; j++) {
            A[i][j] = Math.random() * 20 - 10;
            if (A[i][j] < 0) product[j] *= A[i][j];
        }
    }
}