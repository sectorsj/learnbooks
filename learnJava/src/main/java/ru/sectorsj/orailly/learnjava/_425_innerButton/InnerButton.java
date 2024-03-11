package ru.sectorsj.orailly.learnjava._425_innerButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerButton {
    JFrame frame;
    JButton b;

    public static void main(String[] args) {
        InnerButton gui = new InnerButton();
        gui.go();
    }

    private void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b = new JButton("A");
        b.addActionListener(new BListener());

        frame.getContentPane().add(BorderLayout.SOUTH, b);
        frame.setSize(200, 100);
        frame.setVisible(true);

    }

    private class BListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (b.getText().equals("A")){
                b.setText("B");
            } else {
                b.setText("A");
            }
        }
    }
}