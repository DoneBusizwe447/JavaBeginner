/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intro2javaprogram;

/**
 *
 * @author magni
 */
public class TestStackOfIntegers {
    public static void main(String[] args) {
        StackOfInteger stack = new StackOfInteger();
    
    for (int i = 0; i < 10; i++)
    stack.push(i);
    
    while (!stack.empty())
            System.out.println(stack.pop() + "");
}
}