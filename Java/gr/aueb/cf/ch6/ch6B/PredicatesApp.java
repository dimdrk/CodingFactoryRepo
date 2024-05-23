package gr.aueb.cf.ch6.ch6B;

import java.util.Scanner;

public class PredicatesApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        boolean threeEven;

        System.out.println("Please give six numbers between 1-49:");
        for (int i : arr) {
            arr[i] = in.nextInt();
        }

        threeEven = checksForThreeEven(arr);
        System.out.println("Has up to three even numbers: " + threeEven);
    }

    public static boolean checksForThreeEven(int[] arr) {
        boolean hasThreeEven = false;
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 2) == 0) {
                counter++;
            }
        }

        if (counter <= 3) {
            hasThreeEven = true;
        }

        return hasThreeEven;
    }
}
