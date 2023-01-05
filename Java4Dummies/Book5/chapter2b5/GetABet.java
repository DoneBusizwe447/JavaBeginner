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

public class GetABet {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
        int bank = 1000;  //assume the ser has R1,000
        int bet;         //
        
        System.out.println("You can bet between 1 and "+ bank);
        
        do{
            System.out.println("enter your bet: ");
            bet = sc.nextInt();
            } while ((bet <= 0) || (bet > bank) );
        System.out.println("Your Money's good here. ");
    }
    
}
