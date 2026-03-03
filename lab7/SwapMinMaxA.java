public static void swapMinMax() {
    int[] A = new int[25];
    int min = 0, max = 0;

    for (int i = 0; i < 25; i++) {
        A[i] = (int)(Math.random() * 100);
        if (A[i] < A[min]) min = i;
        if (A[i] > A[max]) max = i;
    }

    int temp = A[min];
    A[min] = A[max];
    A[max] = temp;
}