/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author magni
 */
import java.util.Scanner;

public class CircleAreaApp {
static Scanner sc = new Scanner(System.in);
public static void main(String[] args){
    System.out.println(" Welcome to the calculator ");
    System.out.print("Enter the radius of the Sekele: ");
    double r =  sc.nextDouble();
    double area = Math.PI * (r * r);
    System.out.println("The area is " + area);
}
}
