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


public class LeapYear {
    public static void main(String[] args){
        //Create a scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the the Yearrr: ");
        int year = input.nextInt();
        
        //Check if its a Leap year
        boolean isLeapYear = (year % 4 == 0 && year% 100 !=0) || (year % 400 == 0);
        
        //Display the the result 
        System.out.println(year + "is a leap year? " + isLeapYear);
        
    }
    
}
