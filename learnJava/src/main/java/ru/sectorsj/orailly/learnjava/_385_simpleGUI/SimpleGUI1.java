package ru.sectorsj.orailly.learnjava._385_simpleGUI;

import javax.swing.*;

public class SimpleGUI1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("click me");

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}