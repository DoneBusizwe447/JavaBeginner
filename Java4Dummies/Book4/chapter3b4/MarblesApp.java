/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter3b2;

/**
 *
 * @author magni
 */
import java.util.Scanner;

public class MarblesApp {
    
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        //Declarations
        int numberOfMarbles;
        int numberOfChildren;
        int marblesPerChild;
        int marblesLeftOver;
        
        //Get input data
        System.out.println("Welcome to the DreamChase Marble.  ");
        System.out.print("Number of marbles: ");
        numberOfMarbles = sc.nextInt();
        System.out.print("Number of children: ");
        numberOfChildren = sc.nextInt();
        
        //Calculate the results 
        marblesPerChild = numberOfMarbles / numberOfChildren;
        marblesLeftOver = numberOfMarbles % numberOfChildren;
        
        
        ///Print the results 
        System.out.println("Give each Youngin " + marblesPerChild + " marbles. ");
        System.out.println("You wil have " + marblesLeftOver + " marbles.");
        
        
    }
    
}
