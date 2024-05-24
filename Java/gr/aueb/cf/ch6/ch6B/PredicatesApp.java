package gr.aueb.cf.ch6.ch6B;

import java.util.Scanner;

/**
 * The user gives six numbers between 1-49 and
 * the program checks if:
 * 1. There are up to three even values in the array.
 * 2. There are up to three odd values in the array.
 * 3.
 * 4.
 * 5.
 *
 * @author DimDrk
 */
public class PredicatesApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        boolean threeEven;
        boolean threeOdd;
        boolean threeConsecutive;

        System.out.println("Please give six numbers between 1-49:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        threeEven = areThreeEven(arr);
        System.out.println("Has up to three even numbers: " + threeEven);

        threeOdd = areThreeOdd(arr);
        System.out.println("Has up to three odd numbers: " + threeOdd);

        threeConsecutive = moreThanThreeConsecutive(arr);
        System.out.println("There are more than three consecutive: " + threeConsecutive);
    }

    /**
     * Checks if there are up to three even values in the array.
     *
     * @param arr   the input array.
     * @return      true, if there are up to three even values.
     *              false, otherwise.
     */
    public static boolean areThreeEven(int[] arr) {
        int count = 0;

        for (int item : arr) {
            if (item % 2 == 0) {
                count++;
            }
        }
        return (count <= 3 && count != 0);
    }

    /**
     * Checks if there are up to three odd values in the array.
     *
     * @param arr   the input array.
     * @return      true, if there are up to three odd values.
     *              false, otherwise.
     */
    public static boolean areThreeOdd(int[] arr) {
        int count = 0;

        for (int item : arr) {
            if (item % 2 != 0) {
                count++;
            }
        }
        return (count <= 3 && count != 0);
    }

    /**
     * Not finished
     *
     * @param arr   the input array.
     * @return      true, if there are up to three odd values.
     *              false, otherwise.
     */
    public static boolean moreThanThreeConsecutive(int[] arr) {
        int cons = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            if ((arr[i] == arr[i+1] - 1) && (arr[1] == arr[i+2] -2)) {
                cons++;
            }
        }
        return cons >= 1;
    }

    /**
     * Not finished
     *
     * @param arr
     * @return
     */
    public static boolean areSameGroupOften(int[] arr) {
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
