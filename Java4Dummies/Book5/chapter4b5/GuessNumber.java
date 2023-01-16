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

public class GuessNumber {

    public static void main(String[] args) {
        //Generate a random number to be guessed
        
        int number = (int) (Math.random() * 101);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number Between 0 and 100");

        int guess = -1;
        while (guess != number) {
            //Prompt the to guess the number
            System.out.println("\nEnter your guess: ");
            guess = input.nextInt();

            if (guess == number) {
                System.out.println("Ye THe number is " + number);
            } else if (guess > number) {
                System.out.println("Your guess is too high");
            } else {
                System.out.println("your guess is too low");
            }

        } //END OF LOOP

    }
}
