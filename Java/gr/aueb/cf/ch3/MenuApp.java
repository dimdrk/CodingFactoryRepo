package gr.aueb.cf.ch3.tests;

import java.util.Scanner;

/**
 * Το πρόγραμμα εμφανίζει μια λίστα επιλογών,
 * ο χρήστης εισάγει από το standard in έναν
 * ακέραιο και το πρόγραμμα εμφανίζει την επιλογή του.
 *
 * @author DimDrk
 */

public class MenuApp {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών.
        Scanner in = new Scanner(System.in);
        int choice = 0;

        // Εντολές
        do {
            System.out.println("Επιλέξτε μία από τις παρακάτω επιλογές:");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Ενημέρωση");
            System.out.println("3. Διαγραφή");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");
            choice = in.nextInt();
            if (choice == 1) {
                System.out.println("Επιλέξατε Εισαγωγή");
            }else if (choice == 2) {
                System.out.println("Επιλέξατε Ενημέρωση");
            }else if (choice == 3) {
                System.out.println("Επιλέξατε Διαγραφή");
            }else if (choice == 4) {
                System.out.println("Επιλέξατε Αναζήτηση");
            }
        } while (choice != 5);

        // Μήνυμα τερματισμόυ
        System.out.println("Ευχαριστούμε!");
    }
}
