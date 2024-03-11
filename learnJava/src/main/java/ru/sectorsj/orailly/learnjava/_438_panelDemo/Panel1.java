package ru.sectorsj.orailly.learnjava._438_panelDemo;

import javax.swing.*;
import java.awt.*;

class Panel1 {
    public static void main(String[] args) {
        Panel1 gui = new Panel1();
        gui.setUp();
    }

    private void setUp() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        JButton button = new JButton("shock me");

        panel.add(button);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}