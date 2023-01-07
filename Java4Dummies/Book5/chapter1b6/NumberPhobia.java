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

public class NumberPhobia  {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int number = 2;
        String input;
        while(true){
            System.out.println(number + " ");
            System.out.println("Do you want to keep couting ?" 
                                                  + " (Y or N)");
            input = sc.next();
            if(input.equalsIgnoreCase("N"))
                break;
            number += 2;
        }
        System.out.println("\nWhoa ! That wasa close. \n");
    }
}
