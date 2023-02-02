/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intro2javaprogram;

/**
 *
 * @author magni
 */
public class TestReturnGradeMethod {
    
     public static void main(String[] args) {
        System.out.println("The Grade is " + getGrade(78.5));
       
        System.out.println("The Gradae is " + getGrade(59.5));
    }

    public static char getGrade(double score) {
        if (score >= 90.0) 
            return 'A';
         else if (score >= 80.0) 
            return 'B';
         else if (score >= 70.0) 
             return 'C';
         else if (score >= 60.0) 
            return 'D';
         else 
            return 'F';
        
    }
}
