/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson2stringbuilder;

/**
 *
 * @author magni
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        emp1.setEmpId(7);
        emp2.setEmpId(10);
        
        System.out.println("employee 1 id is " + emp1.getEmpId());
        System.out.println("employee 2 id is " + emp2.getEmpId());
    }
    
}
