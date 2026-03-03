public static void sumPositiveB() {
    int[] B = new int[15];
    int sum = 0;

    for (int i = 0; i < 15; i++) {
        B[i] = (int)(Math.random() * 40 - 20);
        if (B[i] > 0) sum += B[i];
    }

    System.out.println("Сумма положительных элементов B: " + sum);
}