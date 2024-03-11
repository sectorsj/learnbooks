package ru.sectorsj.java_for_biginners._13_gui._490_button_and_handler_demo;

import javax.swing.*;

// Класс для окна:
class MyFrame extends JFrame {
    // Конструктор:
    MyFrame(String name, String txt, ImageIcon img) {
        // Вызов конструктора суперкласса:
        super(name);

        // Положение и размеры окна:
        setBounds(250, 250, 300, 200);

        // Окно постоянных размеров:
        setResizable(false);

        // Реакция на щелчок системной пиктограммы:
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Отключение менеджера компоновки для окна:
        setLayout(null);

        // Создание объекта панели:
        MyPanel pnl = new MyPanel(txt, img);

        // Создание объекта кнопки:
        MyButton btn = new MyButton(50, 120, 200, 30);

        // Добавление панели в окно:
        add(pnl);

        // Добавление кнопки в окно:
        add(btn);

        // Отображение окна на экране:
        setVisible(true);
    }
}
