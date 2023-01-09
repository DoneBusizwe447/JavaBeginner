/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter8b2;

/**
 *
 * @author magni
 */
import java.util.*;


public class GetInteger {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the Intetger: ");
        int i = GetAnInteger();
        System.out.println("You enterd " + i);
      }
    public static int GetAnInteger(){
        while (true){
            try {
                return sc.nextInt();
            }
            catch (InputMismatchException e){
                sc.next();
                System.out.println("Thts not a number ! ");
            }
        }
    }
}
