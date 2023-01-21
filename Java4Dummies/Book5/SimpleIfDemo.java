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

public class SimpleIfDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer: ");
        int number = input.nextInt();

        if (number % 5 == 0) {
            System.out.print("HIFIVIOFOREIGN");
        }

        if (number % 2 == 0) {
            System.out.println("HIEVEN");
        }

    }

}
