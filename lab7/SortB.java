public static void sortArray() {
    int[] B = new int[25];

    for (int i = 0; i < 25; i++)
        B[i] = (int)(Math.random() * 100);

    java.util.Arrays.sort(B);
}