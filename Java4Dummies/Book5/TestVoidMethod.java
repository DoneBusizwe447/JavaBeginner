/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intro2javaprogram;

/**
 *
 * @author magni
 */
public class TestVoidMethod {

    public static void main(String[] args) {
        System.out.println("The Grade is ");
        printGrade(78.5);

        System.out.println("The Gradae is ");
        printGrade(59.5);

    }

    public static void printGrade(double score) {
        if (score >= 90.0) {
            System.out.println(" A+ ");
        } else if (score >= 80.0) {
            System.out.println(" B ");
        } else if (score >= 70.0) {
            System.out.println(" C ");
        } else if (score >= 60.0) {
            System.out.println(" D ");
        } else {
            System.out.println("F 4 FAIL");
        }
    }
}
