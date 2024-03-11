package ru.sectorsj.java_for_biginners._13_gui._467_simple_window_demo;

import javax.swing.*;

class MyFrame extends JFrame {

    // Конструктор
    MyFrame(String name) {
        // Вызов конструктора суперкласса:
        super(name);

        // Положение и размер окна:
        setBounds(250, 250, 300, 200);

        // Окно постоянных размеров:
        setResizable(false);

        // Реакция на щелчок системной пиктограммы:
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Отображение окна на экране:
        setVisible(true);
    }
}
