package gr.aueb.cf.ch2.tests;

import java.util.Scanner;

/**
 * Ο χρήστης είσαγει έναν ακέραιο αριθμό για θερμοκρασία σε
 * βαθμούς φαρεναϊντ και μετατρέπεται σε βαθμούς κελσίου.
 *
 * @author DimDrk
 */
public class FarenheitApp {
    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int fahrenheit = 0;
        int celcius = 0;

        // Εντολές
        System.out.println("Please insert temperature in fahrenheit");
        fahrenheit = in.nextInt();
        celcius = 5 * (fahrenheit - 32) / 9;

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("The %d fahrenheit are %d celcius.", fahrenheit, celcius);
    }
}
