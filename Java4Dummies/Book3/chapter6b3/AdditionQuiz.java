/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package intro2javaprogram;

/**
 *
 * @author magni
 */

import java.util.Scanner;

public class AdditionQuiz {

  
    public static void main(String[] args) {
        // TODO code application logic here
        
        int number1 = (int)(System.currentTimeMillis() %10);
        int number2 = (int)(System.currentTimeMillis()/7%10);
        
        //create scanner 
        Scanner input = new Scanner(System.in);
     
        System.out.println("What is "  +  number1 + " + " + number2 + "?");
        int number = input.nextInt();
        while (number1 + number2 != number){
            System.out.println("Hayikhona Bosss try again next time");
            number = input.nextInt();
        }
        
        System.out.println( number1 + "+" + number2 + " = " +  " is " + (number1 + number2 == number));
        
        System.out.println("Nazoke Skhokho");
       
    }
    
}
