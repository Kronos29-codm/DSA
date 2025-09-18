/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rain;
import java.util.Scanner;
/**
 *
 * @author CL2~PC27
 */
public class RPS_CLI {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int HP1 = 5;
        int HP2 = 5;
        
        while ((HP1 > 0) && (HP2 > 0)){
            System.out.println("[1] - Rock");
            System.out.println("[2] - Paper");
            System.out.println("[3] - Scissors");
            System.out.println("");
            System.out.println("Player 1:");
            int P1 = in.nextInt();
            System.out.println("Player 2:");
            int P2 = in.nextInt();
            if (P1==P2){
                System.out.println("DRAW!!!");
            } else if ((P1 == 1 && P2 == 2) || (P1 == 2 && P2 == 3) || (P1 == 3 & P2 == 1)){
                System.out.println("PLAYER 2 WINS THE ROUND!!!");
                HP1 --;
            } else if ((P1 == 1 && P2 == 3) || (P1 == 2 && P2 == 1) || (P1 == 3 & P2 == 2)){
                System.out.println("PLAYER 1 WINS ROUND!!!");
                HP2 --;
            } else {
                System.out.println("Invalid input.");
            }
            
            System.out.println("Player 1 Health: "+HP1);
            System.out.println("Player 2 Health: "+HP2);
        }
        
        if (HP1==0){
            System.out.println("Player 2 wins the game!!!");
        } else if (HP2==0){
            System.out.println("Player 1 wins the game!!!");
        }
    }
}