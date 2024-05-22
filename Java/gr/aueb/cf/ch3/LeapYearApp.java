package gr.aueb.cf.ch3.tests;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει από το standard in έναν
 * ακέραιο αριθμό ως έτος και το πρόγραμμα
 * υπολογίζει εάν το έτος είναι δίσεκτο και
 * το εμφανίζει στην οθόνη (standard out).
 *
 * @author DimDrk
 */
public class LeapYearApp {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών.
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        int remain4 = 0;
        int remain100 = 0;
        int remain400 = 0;
        boolean leapYear = false;

        // Εντολές
        System.out.println("Please insert year");
        year = scanner.nextInt();
        remain4 = year % 4;
        remain100 = year % 100;
        remain400 = year % 400;


        if (remain4 == 0 && remain100 != 0){
            leapYear = true;
        } else if (remain4 == 0 && remain100 == 0 && remain400 == 0) {
            leapYear = true;
        } else if (remain4 == 0 && remain100 == 0 && remain400 != 0) {
            leapYear = false;
        }

        // Εκτύπωση αποτελεσμάτων.
        System.out.printf("The year %d is leap year: %b", year, leapYear);
    }
}
