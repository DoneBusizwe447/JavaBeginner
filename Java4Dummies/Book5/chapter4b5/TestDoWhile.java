/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intro2javaprogram;

/**
 *
 * @author magni
 */

import java.util.Scanner;


public class TestDoWhile {
    public static void main(String[] args) {
        
        int data;
        int sum = 0;
        
        //Create a Scanner 
        Scanner input = new Scanner(System.in);
        
        //Keep reading data until the input is 0
        do {
            System.out.println("Enter an integer (the input endds if it is 0): ");
            data = input.nextInt();
           
            sum += data;
            
        } while (data != 0);
        
        
        System.out.println("The sum is " + sum);
        
    }
}
