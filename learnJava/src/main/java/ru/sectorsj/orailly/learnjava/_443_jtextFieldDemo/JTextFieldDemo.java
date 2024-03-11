package ru.sectorsj.orailly.learnjava._443_jtextFieldDemo;

import javax.swing.*;
import java.awt.*;

public class JTextFieldDemo {
    public static void main(String[] args) {
        JTextFieldDemo gui = new JTextFieldDemo();
        gui.setUp();
    }
    private void setUp() {
        JTextField field = getjTextField();
        System.out.println(field.getText());

        field.setText("Что угодно");
        field.setText("");
        // field.addActionListener(myActionListener);
        field.selectAll();
        field.requestFocus();
    }

    private JTextField getjTextField() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JTextField field = new JTextField("Ваше имя", 20);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setSize(300, 300);
        frame.setVisible(true);
        panel.add(field);
        return field;
    }
}
