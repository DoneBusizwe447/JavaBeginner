/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author magni
 */

import javax.swing.*;


public class SimpleGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("DOWN DREAMSCATE");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(800, 800);
        frame.setVisible(true);
        
    }
}
