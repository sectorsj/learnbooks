package ru.sectorsj.orailly.learnjava._396_simpleGUI2;

import javax.swing.*;
import java.awt.*;

class MyDrawPanel2 extends JPanel {

    public void paintComponent(Graphics g){

        Graphics2D g2d = (Graphics2D) g;
        GradientPaint gradient = new GradientPaint(70, 70, Color.blue, 150, 150, Color.orange);
        g2d.setPaint(gradient);
        g2d.fillOval(70,70, 100, 100);
    }
}