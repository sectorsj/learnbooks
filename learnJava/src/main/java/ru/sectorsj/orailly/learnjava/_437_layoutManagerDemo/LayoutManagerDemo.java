package ru.sectorsj.orailly.learnjava._437_layoutManagerDemo;

import javax.swing.*;
import java.awt.*;

class LayoutManagerDemo {
    public static void main(String[] args) {
        LayoutManagerDemo gui = new LayoutManagerDemo();
        gui.setUp();
    }

    private void setUp() {
        JFrame frame = new JFrame();
        JButton east = new JButton("East");
        JButton west = new JButton("West");
        JButton north = new JButton("North");
        JButton south = new JButton("South");
        JButton center = new JButton("Center");

        frame.getContentPane().add(BorderLayout.EAST, east);
        frame.getContentPane().add(BorderLayout.WEST, west);
        frame.getContentPane().add(BorderLayout.NORTH, north);
        frame.getContentPane().add(BorderLayout.SOUTH, south);
        frame.getContentPane().add(BorderLayout.CENTER, center);

        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}