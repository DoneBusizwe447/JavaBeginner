/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter4b2;

/**
 *
 * @author magni
 */
import java.util.Scanner;

public class GetABet3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
        int bank = 1000;
        int bet;
        boolean validBet;
        
        System.out.println("you can bet between 1 and " + bank);
        do{
            System.out.println("Enter your bet: ");
            bet = sc.nextInt();
            validBet = true;
            if ((bet <= 0) || (bet > bank))
            {
             validBet = false;
                System.out.println("Whaa are yaa Krazy ?");  }              
            } while (!validBet);
            System.out.println("Yaa Casshh is Safe in the safe");
       
 }
        }        

