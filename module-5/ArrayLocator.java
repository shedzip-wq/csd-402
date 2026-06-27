/*
	* Author: Sheridan Dela Cruz
	* Date: June 27, 2026
	* Module 5.2
	* Description: This program locates the positions of the largest and smallest values
	* in two‑dimensional int and double arrays. It provides four methods that
	* scan the array and return the row and column index of the extreme value
	* as a two‑element int array.
 */
 
 public class ArrayLocator {

    /**
     * locateLargest (double[][])
     * --------------------------
     * Scans a 2D double array and returns the location of the largest value.
     *
     * @param arrayParam the 2D array to search
     * @return an int[] containing {rowIndex, columnIndex} of the largest element
     */
    public static int[] locateLargest(double[][] arrayParam) {

        // Start by assuming the first element is the largest
        int[] location = {0, 0};
        double max = arrayParam[0][0];

        // Loop through every row and column
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {

                // If a larger value is found, update max and its location
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;   // row index
                    location[1] = j;   // column index
                }
            }
        }

        return location;
    }

    /**
     * locateLargest (int[][])
     * -----------------------
     * Scans a 2D int array and returns the location of the largest value.
     *
     * @param arrayParam the 2D array to search
     * @return an int[] containing {rowIndex, columnIndex} of the largest element
     */
    public static int[] locateLargest(int[][] arrayParam) {

        int[] location = {0, 0};
        int max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {

                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }

    /**
     * locateSmallest (double[][])
     * ---------------------------
     * Scans a 2D double array and returns the location of the smallest value.
     *
     * @param arrayParam the 2D array to search
     * @return an int[] containing {rowIndex, columnIndex} of the smallest element
     */
    public static int[] locateSmallest(double[][] arrayParam) {

        int[] location = {0, 0};
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {

                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }

    /**
     * locateSmallest (int[][])
     * ------------------------
     * Scans a 2D int array and returns the location of the smallest value.
     *
     * @param arrayParam the 2D array to search
     * @return an int[] containing {rowIndex, columnIndex} of the smallest element
     */
    public static int[] locateSmallest(int[][] arrayParam) {

        int[] location = {0, 0};
        int min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {

                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }

    /**
     * Optional main method for demonstration and testing.
     */
    public static void main(String[] args) {

    // Sample 2D int array to test with
    int[][] sampleInts = {
        {3, 8, 2},
        {4, 1, 9},
        {7, 6, 5}
    };

    // Sample 2D double array to test with
    double[][] sampleDoubles = {
        {2.5, 8.1, 3.3},
        {4.0, 1.2, 9.9},
        {7.4, 6.6, 5.5}
    };

    // Test largest and smallest for int[][]
    int[] largestInt = locateLargest(sampleInts);
    int[] smallestInt = locateSmallest(sampleInts);

    System.out.println("Largest int value at:  [" + largestInt[0] + ", " + largestInt[1] + "]");
    System.out.println("Smallest int value at: [" + smallestInt[0] + ", " + smallestInt[1] + "]");

    // Test largest and smallest for double[][]
    int[] largestDouble = locateLargest(sampleDoubles);
    int[] smallestDouble = locateSmallest(sampleDoubles);

    System.out.println("Largest double value at:  [" + largestDouble[0] + ", " + largestDouble[1] + "]");
    System.out.println("Smallest double value at: [" + smallestDouble[0] + ", " + smallestDouble[1] + "]");
}   // closes main

}   // closes class ArrayLocator

