package ru.sectorsj.java_for_biginners._13_gui._490_button_and_handler_demo;

import javax.swing.*;

// Класс панели:
class MyPanel extends JPanel {
    // Конструктор:
    MyPanel(String txt, ImageIcon img) {
        // Вызов конструктора супер класса:
        super();

        // Положение и размеры панели:
        setBounds(5,5, 280, 110);

        // Рамка вокруг панели:
        setBorder(BorderFactory.createEtchedBorder());

        // Отключение менеджера компоновки:
        setLayout(null);

        // Создание объекта для метки с изображением:
        JLabel imgLbl = new JLabel(img);

        // Положение и размер метки:
        imgLbl.setBounds(10, 10, 90, 90);

        // Рамка вокруг метки:
        imgLbl.setBorder(BorderFactory.createEtchedBorder());

        // Создание объекта для метки с тестом:
        JLabel txtLbl = new JLabel(txt, JLabel.CENTER);

        // Положение и размер метки:
        txtLbl.setBounds(110, 10, 165, 90);

        // Рамка вокруг метки:
        txtLbl.setBorder(BorderFactory.createEtchedBorder());

        // Добавление меток на панель:
        add(imgLbl);
        add(txtLbl);
    }
}
