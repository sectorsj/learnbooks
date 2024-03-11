package ru.sectorsj.orailly.learnjava._445_jTextAreaDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextAreaDemo implements ActionListener {
    JTextArea text;

    public static void main(String[] args) {
        JTextAreaDemo gui = new JTextAreaDemo();
        gui.setUp();
    }

    private void setUp() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton("just click it");
        button.addActionListener(this);
        text = new JTextArea(10, 20);
        text.setLineWrap(true);

        JScrollPane scroller = new JScrollPane(text);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel.add(scroller);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.SOUTH, button);

        frame.setSize(350, 300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        text.append("button clicked \n");
    }
}