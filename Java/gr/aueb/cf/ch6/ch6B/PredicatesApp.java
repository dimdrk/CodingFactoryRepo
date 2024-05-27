package gr.aueb.cf.ch6.ch6B;

import java.util.Scanner;

/**
 * The user gives six numbers between 1-49 and
 * the program checks if:
 * 1. There are up to three evens in the array.
 * 2. There are up to three odds in the array.
 * 3. There are more than three consecutive values in the array.
 * 4. There are more than three with the same ending in the array.
 * 5. There are more than three with the same group of ten in the array.
 *
 * @author DimDrk
 */
public class PredicatesApp {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        int[] arr = new int[6];
        boolean areThreeEvens;
        boolean areThreeOdds;
        boolean areThreeConsecutive;
        boolean hasSameEnding;
        boolean areSameGroupOfTen;

        arr = populateArr(arr);

        areThreeEvens = upToThreeEvens(arr);
        System.out.println("Has up to three even numbers: " + areThreeEvens);

        areThreeOdds = upToThreeOdds(arr);
        System.out.println("Has up to three odd numbers: " + areThreeOdds);

        areThreeConsecutive = moreThanThreeConsecutive(arr);
        System.out.println("There are more than three consecutive: " + areThreeConsecutive);

        hasSameEnding = sameEnding(arr);
        System.out.println("There are more than three with the same ending: " + hasSameEnding);

        areSameGroupOfTen = sameGroupOfTen(arr);
        System.out.println("There are more than three with the same group of ten: " + areSameGroupOfTen);
    }

    /**
     * Populates an array with values from the standard IO.
     *
     * @param arr   the input array.
     * @return      the populated array.
     */
    public static int[] populateArr(int[] arr) {
        System.out.println("Please give six numbers between 1-49:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        return arr;
    }

    /**
     * Checks if there are up to three evens in the array.
     *
     * @param arr   the input array.
     * @return      true, if there are up to three evens.
     *              false, otherwise.
     */
    public static boolean upToThreeEvens(int[] arr) {
        int count = 0;

        for (int item : arr) {
            if (item % 2 == 0) {
                count++;
            }
        }
        return (count <= 3 && count != 0);
    }

    /**
     * Checks if there are up to three odds in the array.
     *
     * @param arr   the input array.
     * @return      true, if there are up to three odds.
     *              false, otherwise.
     */
    public static boolean upToThreeOdds(int[] arr) {
        int count = 0;

        for (int item : arr) {
            if (item % 2 != 0) {
                count++;
            }
        }
        return (count <= 3 && count != 0);
    }

    /**
     * Checks if there are more than three consecutive values.
     * in the array.
     *
     * @param arr   the input array.
     * @return      true, if there are up to three odd values.
     *              false, otherwise.
     */
    public static boolean moreThanThreeConsecutive(int[] arr) {
        int cons = 0;
        for (int i = 0; i < arr.length - 3; i++) {
            if ((arr[i] == arr[i+1] - 1) && (arr[1] == arr[i+2] -2)) {
                cons++;
            }
        }
        return cons >= 1;
    }

    /**
     * Checks if there are more than three consecutive values
     *
     * @param arr   the input array.
     * @return      true, if there are up to three odd values.
     *              false, otherwise.
     */
    public static boolean sameEnding(int[] arr) {
        int[] endings = new int[10];
        boolean hasSameEndings = false;

        for (int item : arr) {
            endings[item %  10]++;
        }
        for (int item : endings) {
            if (item >= 3) {
                hasSameEndings = true;
                break;
            }
        }
        return hasSameEndings;
    }

    /**
     * Not finished
     *
     * @param arr
     * @return
     */
    public static boolean sameGroupOfTen(int[] arr) {
        int[] tens = new int[10];
        boolean sameTen = false;
        int count = 0;

        for (int item : arr) {
            tens[item / 10]++;
        }

        for (int item : tens) {
            if (item >= 3) {
                sameTen = true;
                break;
            }
        }
        return sameTen;
    }
}
