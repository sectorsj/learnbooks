package ru.sectorsj.orailly.learnjava._436_borderlayoutDemo;

import javax.swing.*;
import java.awt.*;

class BorderLayoutDemo {
    public static void main(String[] args) {
        BorderLayoutDemo gui = new BorderLayoutDemo();
        gui.setUp();
    }

    private void setUp() {
        JFrame frame = new JFrame();
        JButton button = new JButton("There is no spoon...");

        // Увеличиваем новые размеры шрифта
        Font bigFont = new Font("serif", Font.BOLD, 28);
        // Применяем новые настройки шрифт
        button.setFont(bigFont);
        frame.getContentPane().add(BorderLayout.NORTH, button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}