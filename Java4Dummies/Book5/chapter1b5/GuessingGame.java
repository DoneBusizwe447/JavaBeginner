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

public class GuessingGame {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean keepPlaying = true;
        System.out.println("Lets play a guessing game!");
        while (keepPlaying) {
            boolean validInput;
            int number, guess;
            String answer;
            //Pick a random number
            number = (int) (Math.random() * 10) + 1;
            //Get the guess
            System.out.println("\nI'm thinking of a number " + "between 1 and 10.");
            System.out.println("What do you think it is ? ");
            do {
                guess = sc.nextInt();
                validInput = true;
                if ((guess < 1) || (guess > 10)) {
                    System.out.println("I said, between 1 and 10. " + "Try again: ");
                    validInput = false;
                }
            } while (!validInput);
            // Check the guess
            if (guess == number) {
                System.out.println("Combo iCorrect!");
            } else {
                System.out.println("Hayikhona Bafo! " + "the number was " + number);
            }

            // play again?
            do {
                System.out.println("\n Play Hape le Hape? (Y or N)");
                answer = sc.next();
                validInput = true;
                if (answer.equalsIgnoreCase("Y")); else if (answer.equalsIgnoreCase("N")) {
                    keepPlaying = false;
                } else {
                    validInput = false;
                }
            } while (!validInput);
        }
        System.out.println("\nThank you for playing! ");

    }
}
