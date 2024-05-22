package gr.aueb.cf.ch2.tests;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει 3 αριθμούς ως ημέρα, μήνα, έτος
 * και το πρόγραμμα εμφανίζει την ημερομηνία.
 *
 * @author DimDrk
 */
public class DateShowApp {
    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int date = 0;
        int month = 0;
        int year = 0;

        // Εντολές
        System.out.println("Please insert date");
        date = in.nextInt();
        System.out.println("Please insert month");
        month = in.nextInt();
        System.out.println("Please insert year");
        year = in.nextInt();
        year = year%100;

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("The date is: %02d/%02d/%02d", date, month, year);
    }
}
