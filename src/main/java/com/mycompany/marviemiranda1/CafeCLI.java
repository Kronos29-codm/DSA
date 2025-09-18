/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.rain;
import java.util.Scanner;
/**
 *
 * @author CL2~PC37
 */
public class CafeCLI {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int hotdot = 25;
        int siopai = 10;
        int cok = 20;
        int spit = 25;
        int sub = 0;
        double change = 0;
        double total = 0;
        double vat = 0;
        double tax = 0.12;
        
        System.out.println("CAFETERIA");
        System.out.println("[1] - Snacks");
        System.out.println("[2] - Drinks");
        System.out.println("Choose category");
        int option = in.nextInt();
        if (option ==1){
            System.out.println("[1] - Hotdot - P25");
            System.out.println("[2] - Siopai - P10");
            System.out.println("");
            System.out.println("Choose snacks:");
            int snack = in.nextInt();
            if (snack ==1){
                System.out.println("Enter quantity:");
                int qty = in.nextInt();
                sub = qty * hotdot;
                vat = sub * tax;
                total = sub + vat;
                System.out.println("Substotal: " + sub);
                System.out.println("Total: " + total);
                System.out.println("Enter payment:");
                int pay = in.nextInt();
                while (pay < total){
                    System.out.println("Insufficient payment received, please try again!");
                    System.out.println("Enter payment:");
                    pay = in.nextInt();
                }
                in.nextLine();
                change = pay - total;
                String change2 = String.format("%.2f", change);
                System.out.println("Your change is: " + change2);
                
                System.out.println("Would you like to print receipt? (y/n):");
                String receipt = in.nextLine().toLowerCase();
                if (receipt.equals("y")){
                System.out.println("===== R E C E I P T =====");
                    System.out.println(" Order   Amount   Price ");
                    System.out.println(" Siopai  "+qty+"x     ₱"+hotdot);
                    System.out.println(" VAT              "+vat+"   ");
                    System.out.println(" TOTAL            "+total);
                    System.out.println(" AMOUNT PAID      "+pay);
                    System.out.println(" CHANGE           "+change2);
                    System.out.println("=========================");
                } else if (receipt.equals("n")){
                    System.out.println("");
                }
            } else if (snack ==2){
                System.out.println("Enter quantity:");
                int qty = in.nextInt();
                sub = qty * siopai;
                vat = sub * tax;
                total = sub + vat;
                System.out.println("Substotal: " + sub);
                System.out.println("Total: " + total);
                System.out.println("Enter payment:");
                int pay = in.nextInt();
                while (pay < total){
                    System.out.println("Total: " + total);
                    System.out.println("Insufficient payment received, please try again!");
                    System.out.println("Enter payment:");
                    pay = in.nextInt();
                }
                in.nextLine();
                change = pay - total;
                String change2 = String.format("%.2f", change);
                System.out.println("Your change is: " + change2);
                
                System.out.println("Would you like to print receipt? (y/n):");
                String receipt = in.nextLine().toLowerCase();
                if (receipt.equals("y")){
                System.out.println("===== R E C E I P T =====");
                    System.out.println(" Order   Amount   Price ");
                    System.out.println(" Siopai  "+qty+"x     ₱"+siopai);
                    System.out.println(" VAT              "+vat+"   ");
                    System.out.println(" TOTAL            "+total);
                    System.out.println(" AMOUNT PAID      "+pay);
                    System.out.println(" CHANGE           "+change2);
                    System.out.println("=========================");
                } else if (receipt.equals("n")){
                    System.out.println("");
                }
            } else {
            System.out.println("Invalid option");
            }
        } else if (option==2){
            System.out.println("[1] - Cok - P20");
            System.out.println("[2] - Spit - P25");
            System.out.println("");
            System.out.println("Choose Drinks:");
            int drink = in.nextInt();
            if (drink ==1){
                System.out.println("Enter quantity:");
                int qty = in.nextInt();
                sub = qty * cok;
                vat = sub * tax;
                total = sub + vat;
                System.out.println("Substotal: " + sub);
                System.out.println("Total: " + total);
                System.out.println("Enter payment:");
                int pay = in.nextInt();
                while (pay < total){
                    System.out.println("Insufficient payment received, please try again!");
                    System.out.println("Enter payment:");
                    pay = in.nextInt();
                }
                in.nextLine();
                change = pay - total;
                String change2 = String.format("%.2f", change);
                System.out.println("Your change is: " + change2);
                
                System.out.println("Would you like to print receipt? (y/n):");
                String receipt = in.nextLine().toLowerCase();
                if (receipt.equals("y")){
                System.out.println("===== R E C E I P T =====");
                    System.out.println(" Order   Amount   Price ");
                    System.out.println(" Siopai  "+qty+"x     ₱"+cok);
                    System.out.println(" VAT              "+vat+"   ");
                    System.out.println(" TOTAL            "+total);
                    System.out.println(" AMOUNT PAID      "+pay);
                    System.out.println(" CHANGE           "+change2);
                    System.out.println("=========================");
                } else if (receipt.equals("n")){
                    System.out.println("");
                }
            } else if (drink ==2){
                System.out.println("Enter quantity:");
                int qty = in.nextInt();
                sub = qty * spit;
                vat = sub * tax;
                total = sub + vat;
                System.out.println("Substotal: " + sub);
                System.out.println("Total: " + total);
                System.out.println("Enter payment:");
                int pay = in.nextInt();
                while (pay < total){
                    System.out.println("Insufficient payment received, please try again!");
                    System.out.println("Enter payment:");
                    pay = in.nextInt();
                }
                in.nextLine();
                change = pay - total;
                String change2 = String.format("%.2f", change);
                System.out.println("Your change is: " + change2);
                
                System.out.println("Would you like to print receipt? (y/n):");
                String receipt = in.nextLine().toLowerCase();
                if (receipt.equals("y")){
                System.out.println("===== R E C E I P T =====");
                    System.out.println(" Order   Amount   Price ");
                    System.out.println(" Siopai  "+qty+"x     ₱"+spit);
                    System.out.println(" VAT              "+vat+"   ");
                    System.out.println(" TOTAL            "+total);
                    System.out.println(" AMOUNT PAID      "+pay);
                    System.out.println(" CHANGE           "+change2);
                    System.out.println("=========================");
                } else if (receipt.equals("n")){
                    System.out.println("");
                }
            } else {
            System.out.println("Invalid option");
            }
        }  else {
            System.out.println("Invalid category");
        }
    }
}
