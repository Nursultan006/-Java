public static short maxX() {
    short[] array = new short[10];
    short max;

    for (int i = 0; i < 10; i++)
        array[i] = (short)Math.round(50 * Math.random());

    max = array[0];

    for (int i = 1; i < 10; i++)
        if (array[i] > max)
            max = array[i];

    return max;
}