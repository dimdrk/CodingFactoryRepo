package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει δύο αριθμούς (int), και
 * το προγραμμα εκτυπώνει n αστεράκια σε n σειρές.
 */
public class StarsRowsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int stars = 0;
        int rows = 0;

        System.out.println("Please insert the number of stars and a number for rows:");
        stars = in.nextInt();
        rows = in.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
