public static void table3x5() {
    int[][] a = new int[3][5];

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 5; j++) {
            a[i][j] = (int)(Math.random() * 10);
            System.out.print(a[i][j] + " ");
        }
        System.out.println();
    }
}