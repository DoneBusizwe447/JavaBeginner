/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intro2javaprogram;

import java.time.Clock;

/**
 *
 * @author magni
 */
public class Calculator {

    public static void main(String[] args) {
        //check number of string passed

        if (args.length != 3) {
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }

        //the result of the opration
        int result = 0;

        //Determine the operator
        switch (args[1].charAt(0)) {
            case '+':
                result = Integer.parseInt(args[0])
                        + Integer.parseInt(args[2]);
                break;
            case '-':
                result = Integer.parseInt(args[0])
                        - Integer.parseInt(args[2]);
                break;    
            case '/':
                result = Integer.parseInt(args[0])
                        / Integer.parseInt(args[2]);
                break;
            case '*':
                result = Integer.parseInt(args[0])
                        * Integer.parseInt(args[2]);
                break;    

        }
  
      //Display result
        System.out.println(args[0] + args[1] + args[2] + " = " + result);      
        
        
    }
}
