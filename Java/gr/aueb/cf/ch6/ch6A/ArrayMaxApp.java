package gr.aueb.cf.ch6.ch6A;

/**
 * Finds and prints the max position and value
 * of an array based on a generic method.
 *
 * @author DimDrk
 */
public class ArrayMaxApp {

    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 2, 14, 9};
        int maxPosition = 0;

        maxPosition = getMaxPosition(arr, 0, arr.length - 1);
        System.out.printf("Max is: %d. Max position is: %d", arr[maxPosition], maxPosition + 1);
    }

    /**
     * Finds the max position and value of an array
     * based on a generic method.
     *
     * @param arr       the source array.
     * @param low       starting position in the array.
     * @param high      ending position in the array.
     * @return          the position of the array containing the max element value.
     */
    public static int getMaxPosition(int[] arr, int low, int high) {
        int maxPosition = low;
        int maxValue;

        if (low < 0 || (high > arr.length - 1)) {
            System.out.println("Error in array dimensions");
            return -1;
        }

        maxValue = arr[high];
        for (int i = low; i<= high; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }
}