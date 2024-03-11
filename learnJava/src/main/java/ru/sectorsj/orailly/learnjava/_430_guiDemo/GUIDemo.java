package ru.sectorsj.orailly.learnjava._430_guiDemo;

import javax.swing.*;
import java.awt.*;

class GUIDemo {
    public static void main(String[] args) {
        GUIDemo gui = new GUIDemo();
        gui.setUp();
    }

    private void setUp() {
        // 1. Созадем окно (JFrame)
        JFrame frame = new JFrame();

        // 2. Создаем компонет (кнопка, поле ввода и т.д.)
        JButton button = new JButton("click like you mean it");

        // 3. Добавляем компонент внутрь фрейма
        frame.getContentPane().add(BorderLayout.EAST, button);

        // 4. Выводим его на экран (задаем ему размер и делаем видимым)
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}