package ru.sectorsj.orailly.learnjava._440_twoButtonsOnPanelDemo;

import javax.swing.*;
import java.awt.*;

class TwoButtonsOnPanel {
    public static void main(String[] args) {
        TwoButtonsOnPanel gui = new TwoButtonsOnPanel();
        gui.setUp();
    }

    private void setUp() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);

        JButton button = new JButton("shock me");
        JButton buttonTwo = new JButton("bliss");
        // JButton buttonThree = new JButton("huh");

        panel.add(button);
        panel.add(buttonTwo);
        // panel.add(buttonThree);

        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}