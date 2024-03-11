package ru.sectorsj.orailly.learnjava._441_boxLayoutDemo;

import javax.swing.*;
import java.awt.*;

class BoxLayoutDemo {
    public static void main(String[] args) {
        BoxLayoutDemo gui = new BoxLayoutDemo();
        gui.setUp();
    }

    private void setUp() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);

        // изменяем Диспетчер компоновки на новый экземпляр BoxLayout
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton button = new JButton("shock me");
        JButton buttonTwo = new JButton("bliss");

        panel.add(button);
        panel.add(buttonTwo);

        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}