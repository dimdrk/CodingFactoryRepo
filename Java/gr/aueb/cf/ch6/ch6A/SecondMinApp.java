package gr.aueb.cf.ch6.ch6A;

/**
 * Finds the second minimum of an array after sorting the list.
 *
 * @author DimDrk
 */
public class SecondMinApp {

    public static void main(String[] args) {
        int[] arr = {9, 3, 12, 4, 6, 1, 5, 2};
        int secondElement;

        sorted(arr);

        secondElement = getSecondMin(arr);

        if (secondElement == -1) {
            System.out.println("There is no second minimum element.");
        } else {
        System.out.println("The second minimum element of the array is " + secondElement);
        }
    }

    /**
     * Sorts an array with selection sort.
     *
     * @param arr       the source array.
     */
    public static void sorted(int[] arr) {
        int min;
        int minPosition;
        int tmp;

        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            minPosition = i;
            for (int j = i +1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minPosition = j;
                }
            }
            tmp = arr[i];
            arr[i] = min;
            arr[minPosition] = tmp;
        }
    }

    /**
     * Finds the second minimum element of a sorted array.
     *
     * @param arr       the source array.
     * @return          the second minimum element.
     */
    public static int getSecondMin(int[] arr) {
        int min = arr[0];
        int secondMin = arr[0];
        int i = 1;

        while (min == secondMin) {
            secondMin = arr[i];
            i++;
            if (i == arr.length && min == secondMin) {
                secondMin = -1;
                break;
            }
        }
        return secondMin;
    }
}