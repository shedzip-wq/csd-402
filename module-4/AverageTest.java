/*
	* Author: Sheridan Dela Cruz
	* Date: June 18, 2026
	* Module 4.2
	* Description: Program showing overloaded average methods for different array types.
 */
 
 public class AverageTest {

    public static void main(String[] args) {

        // Create arrays of different sizes and types
        short[] shortArray = {5, 10, 15};
        int[] intArray = {2, 4, 6, 8};
        long[] longArray = {100L, 200L, 300L, 400L, 500L};
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5};

        // Display short array and its average
        System.out.println("Short Array:");
        printArray(shortArray);
        System.out.println("Average: " + average(shortArray));
        System.out.println();

        // Display int array and its average
        System.out.println("Int Array:");
        printArray(intArray);
        System.out.println("Average: " + average(intArray));
        System.out.println();

        // Display long array and its average
        System.out.println("Long Array:");
        printArray(longArray);
        System.out.println("Average: " + average(longArray));
        System.out.println();

        // Display double array and its average
        System.out.println("Double Array:");
        printArray(doubleArray);
        System.out.println("Average: " + average(doubleArray));
        System.out.println();
    }

    /* -------------------------------------------------------------
     * PRINT METHODS
     * These overloaded methods print arrays of different data types.
     * ------------------------------------------------------------- */

    // Print short array
    public static void printArray(short[] array) {
    System.out.print("[");
    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i]);
        if (i < array.length - 1) System.out.print(", ");
    }
    System.out.println("]");
}

	public static void printArray(int[] array) {
    System.out.print("[");
    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i]);
        if (i < array.length - 1) System.out.print(", ");
    }
    System.out.println("]");
}

	public static void printArray(long[] array) {
    System.out.print("[");
    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i]);
        if (i < array.length - 1) System.out.print(", ");
    }
    System.out.println("]");
}

	public static void printArray(double[] array) {
    System.out.print("[");
    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i]);
        if (i < array.length - 1) System.out.print(", ");
    }
    System.out.println("]");
}

    /* -------------------------------------------------------------
     * AVERAGE METHODS (OVERLOADED)
     * Each method calculates the average of its specific array type.
     * ------------------------------------------------------------- */

    /**
     * Calculates the average of a short array.
     */
    public static short average(short[] array) {
        int sum = 0; // int used to prevent overflow
        for (short value : array) {
            sum += value;
        }
        return (short)(sum / array.length);
    }

    /**
     * Calculates the average of an int array.
     */
    public static int average(int[] array) {
        long sum = 0; // long used to prevent overflow
        for (int value : array) {
            sum += value;
        }
        return (int)(sum / array.length);
    }

    /**
     * Calculates the average of a long array.
     */
    public static long average(long[] array) {
        long sum = 0;
        for (long value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    /**
     * Calculates the average of a double array.
     */
    public static double average(double[] array) {
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }
}