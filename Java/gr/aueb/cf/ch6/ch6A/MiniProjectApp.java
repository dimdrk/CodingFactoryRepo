package gr.aueb.cf.ch6.ch6A;

/**
 * 1. Searches the array to find a specific value.
 * 2. Searches the array and prints the even numbers.
 * 3. Doubles the value of each item in the array.
 * 4. Checks if there is at least one positive value in the array.
 * 5. Checks if all the values of the array are positive.
 *
 * @author DimDrk
 */
public class MiniProjectApp {

    public static void main(String[] args) {
        int[] arr = {23, 45, 2, 32, 54, 12, 7, 19, 30};
        int num = 32;
        int position;
        int[] mappedArr;
        boolean onePositive;
        boolean allPositive;

        position = getPosition(arr, num);

        if (position == -1) {
            System.out.println("NOT FOUND");
        } else {
            System.out.printf("The position of %d is: %d.\n", num, position + 1);
        }

        printEven(arr);

        mappedArr = mapDouble(arr);
        traverse(mappedArr);

        onePositive = hasOnePositive(arr);
        System.out.println("There is at least one posite: " + onePositive);

        allPositive = areAllPositive(arr);
        System.out.printf("There are all positive: %b", allPositive);

    }

    /**
     * Prints all the values of an array.
     *
     * @param arr       the input array.
     */
    public static void traverse(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    /**
     * Searches the array to find a specific value. If the
     * value is found, the position of the array is returned.
     *
     * @param arr       the input array.
     * @param value     the requested value.
     * @return          the position of the value.
     */
    public static int getPosition(int[] arr, int value) {
        int positionToReturn = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }

    /**
     * Searches the array and prints the even numbers.
     * If none found, prints a message.
     *
     * @param arr       the input array.
     */
    public static void printEven(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
                count++;
            }
        }
        System.out.println();

        if (count == 0) {
            System.out.println("NO EVEN FOUND");
        }
    }

    /**
     * Doubles the value of each item in the array.
     *
     * @param arr   the input array.
     * @return      a new array with elements equal
     *              to double the initial array elements.
     */
    public static int[] mapDouble(int[] arr) {
        int[] arrayToReturn = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrayToReturn[i] = arr[i] * 2;
        }
        return arrayToReturn;
    }

    /**
     * Checks if there is at least one positive value in the array.
     *
     * @param arr   the input array
     * @return      true, if there is at least one positive,
     *              false, otherwise.
     */
    public static boolean hasOnePositive(int[] arr) {
        boolean hasPositive = false;

        for (int item : arr) {
            if (item > 0) {
                hasPositive = true;
                break;
            }
        }
        return hasPositive;
    }

    /**
     * Checks if all the values of the array are positive.
     *
     * @param arr       the input array
     * @return          if all the values are positive,
     *                  false, otherwise.
     */
    public static boolean areAllPositive(int[] arr) {
        int count = 0;

        for (int item : arr) {
            if (item > 0) {
                count++;
            }
        }
        return count == arr.length;
    }
}
