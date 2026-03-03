public static void productPositiveC() {
    int[] C = new int[25];
    int product = 1;

    for (int i = 0; i < 25; i++) {
        C[i] = (int)(Math.random() * 20 - 10);
        if (C[i] > 0) product *= C[i];
    }

    System.out.println("Произведение положительных элементов C: " + product);
}