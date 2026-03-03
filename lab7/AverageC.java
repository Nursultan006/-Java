public static void averageC() {
    int[] C = new int[20];
    double sum = 0;

    for (int i = 0; i < 20; i++) {
        C[i] = (int)(Math.random() * 50);
        sum += C[i];
    }

    System.out.println("Среднее C: " + sum / 20);
}