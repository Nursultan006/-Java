public static void sumNegativeA() {
    int[] A = new int[20];
    int sum = 0;

    for (int i = 0; i < 20; i++) {
        A[i] = (int)(Math.random() * 40 - 20); // числа от -20 до 20
        if (A[i] < 0) sum += A[i];
    }

    System.out.println("Сумма отрицательных элементов A: " + sum);
}