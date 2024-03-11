package ru.sectorsj.orailly.learnjava._396_simpleGUI2;

import javax.swing.*;
import java.awt.*;

class SimpleGUI2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel(new GridLayout(2,1));

        MyDrawPanel2 mdp2 = new MyDrawPanel2();
        MyDrawPanel3 mdp3 = new MyDrawPanel3();

        panel.add(mdp2);
        panel.add(mdp3);

        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}