package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Ο χρήστης επιλέγει από ένα μενού να εμφανίζονται:
 * 1. n αστεράκια οριζόντια, 2. n αστεράκια κάθετα,
 * 3. n γραμμές με n αστεράκια, 4. γραμμές με αστεράκια
 * 1 - n, 5. γραμμές με αστεράκια n - 1 και 6. έξοδος.
 * Το πρόγραμμα υλοποιείται με μεθόδους.
 */
public class StarsMenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;
        int stars = 0;
        int rows = 0;

        do {
            System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
            System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
            System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
            System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 - n");
            System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n - 1");
            System.out.println("6. Έξοδος από το πρόγραμμα");
            System.out.println("Δώσε επιλογή:");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Παρακαλώ δώσε αριθμό για αστεράκια:");
                    stars = in.nextInt();
                    horizontal(stars);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Παρακαλώ δώσε αριθμό για αστεράκια:");
                    stars = in.nextInt();
                    vertical(stars);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Παρακαλώ δώσε γραμμές και αστεράκια:");
                    rows = in.nextInt();
                    stars = in.nextInt();
                    lines(rows, stars);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Παρακαλώ δώσε αριθμό για γραμμές από αστεράκια:");
                    rows = in.nextInt();
                    showAsc(rows);
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Παρακαλώ δώσε αριθμό για γραμμές από αστεράκια:");
                    rows = in.nextInt();
                    showDec(rows);
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Ευχαριστούμε!");
                    break;
                default:
                    System.out.println("Λανθασμένη επιλογή, δοκίμασε ξανά.");
                    break;
            }
        } while (choice != 6);
    }

    /**
     * Shows stars horizontal
     *
     * @param a     number of stars
     */
    public static void horizontal(int a) {
        for (int i = 1; i <= a; i++)
            System.out.print("*");
    }


    /**
     * Shows stars vertical
     *
     * @param a     number of stars
     */
    public static void vertical(int a) {
        for (int i = 1; i <= a; i++)
            System.out.println("*");
    }

    /**
     * Shows lines of stars
     *
     * @param a     number of lines
     * @param b     number of stars
     */
    public static void lines(int a, int b) {
        for (int i = 1; i <= a; i++) {
            horizontal(b);
            System.out.println();
        }
    }

    /**
     * Shows lines of ascending stars
     *
     * @param a     number of lines
     */
    public static void showAsc(int a) {
         for (int i = 1; i <= a; i++) {
            horizontal(i);
            System.out.println();
        }
    }


    /**
     * Shows lines of descending stars
     *
     * @param a     number of lines
     */
    public static void showDec(int a) {
        for (int i = a; i > 0; i--) {
            horizontal(i);
            System.out.println();
        }
    }
}