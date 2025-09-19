/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.marviemiranda1;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author CL2~PC03
 */
public class CafeCLITWO {

    /**
     * @param args the command line arguments
     */
    private static final double HOTDOG_PRICE = 25.0;
    private static final double SIOPAI_PRICE = 10.0;
    private static final double COKE_PRICE = 20.0;
    private static final double SPRITE_PRICE = 25.0;
    private static final double TAX_RATE = 0.12;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean continueOrdering = true;

        // Main loop to keep the program running until the user decides to exit
        while (continueOrdering) {
            try {
                // Display the main menu
                System.out.println("\n===== Vending Machine =====");
                System.out.println("[1] - Snacks");
                System.out.println("[2] - Drinks");
                System.out.println("[3] - Exit");
                System.out.println("===========================");
                System.out.print("Choose a category: ");

                int option = in.nextInt();
                in.nextLine(); // Consume the newline character

                switch (option) {
                    case 1:
                        // Process snacks
                        handleSnackOrder(in);
                        break;
                    case 2:
                        // Process drinks
                        handleDrinkOrder(in);
                        break;
                    case 3:
                        // Exit the program
                        continueOrdering = false;
                        System.out.println("Thank you for using the vending machine. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid category. Please choose from 1, 2, or 3.");
                        break;
                }
            } catch (InputMismatchException e) {
                // Handle cases where the user enters non-integer input
                System.out.println("Invalid input. Please enter a number.");
                in.nextLine(); // Clear the invalid input from the scanner
            }
        }

        in.close();
    }

    /**
     * Handles the menu and selection for snacks.
     * @param in The Scanner object for user input.
     */
    private static void handleSnackOrder(Scanner in) {
        try {
            System.out.println("\n===== SNACKS =====");
            System.out.println("[1] - Hotdog - ₱" + HOTDOG_PRICE);
            System.out.println("[2] - Siopai - ₱" + SIOPAI_PRICE);
            System.out.println("==================");
            System.out.print("Choose a snack: ");
            int snackChoice = in.nextInt();

            switch (snackChoice) {
                case 1:
                    processTransaction("Hotdog", HOTDOG_PRICE, in);
                    break;
                case 2:
                    processTransaction("Siopai", SIOPAI_PRICE, in);
                    break;
                default:
                    System.out.println("Invalid snack option.");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
        } finally {
            in.nextLine(); // Ensure the newline is consumed for the next input
        }
    }

    /**
     * Handles the menu and selection for drinks.
     * @param in The Scanner object for user input.
     */
    private static void handleDrinkOrder(Scanner in) {
        try {
            System.out.println("\n===== DRINKS =====");
            System.out.println("[1] - Coke - ₱" + COKE_PRICE);
            System.out.println("[2] - Sprite - ₱" + SPRITE_PRICE);
            System.out.println("==================");
            System.out.print("Choose a drink: ");
            int drinkChoice = in.nextInt();

            switch (drinkChoice) {
                case 1:
                    processTransaction("Coke", COKE_PRICE, in);
                    break;
                case 2:
                    processTransaction("Sprite", SPRITE_PRICE, in);
                    break;
                default:
                    System.out.println("Invalid drink option.");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
        } finally {
            in.nextLine(); // Ensure the newline is consumed for the next input
        }
    }

    /**
     * Processes a single transaction, including calculation, payment, and receipt printing.
     * @param itemName The name of the item.
     * @param price The price of a single item.
     * @param in The Scanner object for user input.
     */
    private static void processTransaction(String itemName, double price, Scanner in) {
        try {
            System.out.print("Enter quantity: ");
            int qty = in.nextInt();

            double subtotal = qty * price;
            double vat = subtotal * TAX_RATE;
            double total = subtotal + vat;

            System.out.printf("Subtotal: ₱%.2f\n", subtotal);
            System.out.printf("Total: ₱%.2f\n", total);
            System.out.print("Enter payment: ₱");

            double pay = in.nextDouble();

            // Loop to ensure sufficient payment
            while (pay < total) {
                System.out.printf("Insufficient payment. You need ₱%.2f. Please try again.\n", (total - pay));
                System.out.print("Enter payment: ₱");
                pay = in.nextDouble();
            }

            double change = pay - total;
            System.out.printf("Your change is: ₱%.2f\n", change);

            in.nextLine(); // Consume the newline character

            System.out.print("Would you like to print a receipt? (y/n): ");
            String receipt = in.nextLine().toLowerCase();

            if (receipt.equals("y")) {
                printReceipt(itemName, qty, price, vat, total, pay, change);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
        }
    }

    /**
     * Prints the receipt for the transaction.
     * @param itemName The name of the purchased item.
     * @param qty The quantity of the item.
     * @param price The price per item.
     * @param vat The calculated VAT.
     * @param total The total amount.
     * @param pay The amount paid by the customer.
     * @param change The change to be given.
     */
    private static void printReceipt(String itemName, int qty, double price, double vat, double total, double pay, double change) {
        System.out.println("===== R E C E I P T =====");
        System.out.println(" Order     Amount    Price ");
        System.out.printf(" %-8s  %dx     ₱%.2f\n", itemName, qty, price);
        System.out.printf(" VAT                 ₱%.2f\n", vat);
        System.out.println("-------------------------");
        System.out.printf(" TOTAL               ₱%.2f\n", total);
        System.out.printf(" AMOUNT PAID         ₱%.2f\n", pay);
        System.out.printf(" CHANGE              ₱%.2f\n", change);
        System.out.println("=========================");
    }
}
