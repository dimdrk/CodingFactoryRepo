package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει ένα πλήθος n (int), και
 * το προγραμμα εκτυπώνει n κάθετα αστεράκια.
 */
public class StarsVerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int stars = 0;

        System.out.println("Please insert the number of stars:");
        stars = in.nextInt();

        for (int i = 1; i <= stars; i++)
            System.out.println("*");
    }
}
