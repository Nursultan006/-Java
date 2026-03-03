public static void productNegativeA() {
    double[] A = new double[12];
    double product = 1;

    for (int i = 0; i < 12; i++) {
        A[i] = Math.random() * 20 - 10;
        if (A[i] < 0) product *= A[i];
    }

    System.out.println("Произведение отрицательных элементов A: " + product);
}