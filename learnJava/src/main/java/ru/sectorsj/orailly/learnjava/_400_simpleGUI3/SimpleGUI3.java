package ru.sectorsj.orailly.learnjava._400_simpleGUI3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SimpleGUI3 implements ActionListener {
    JFrame frame;

    public static void main(String[] args) {
        SimpleGUI3 gui = new SimpleGUI3();
        gui.go();
    }

    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Изменить цвет");
        button.addActionListener(this);

        MyDrawPanel myDrawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, myDrawPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.repaint();
    }
}