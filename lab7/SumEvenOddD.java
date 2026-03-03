public static void sumEvenOdd() {
    int[] D = new int[30];
    int even = 0, odd = 0;

    for (int i = 0; i < 30; i++) {
        D[i] = (int)(Math.random() * 50);
        if (D[i] % 2 == 0) even += D[i];
        else odd += D[i];
    }

    System.out.println("Сумма чётных: " + even);
    System.out.println("Сумма нечётных: " + odd);
}