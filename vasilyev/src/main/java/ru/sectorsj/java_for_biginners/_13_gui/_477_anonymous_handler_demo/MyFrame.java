package ru.sectorsj.java_for_biginners._13_gui._477_anonymous_handler_demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame {
    // Конструктор
    MyFrame(String name) {
        // Вызов конструктора суперкласса:
        super(name);

        // Положение и размеры окна:
        setBounds(250, 250, 300, 200);

        // Окно постоянных размеров:
        setResizable(false);

        // Реакция на щелчок системной пиктограммы:
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Отключение менеджера компоновки:
        setLayout(null);

        // Создание объекта метки:
        JLabel lbl = new JLabel("Текст синего цвета", JLabel.CENTER);

        // Положение и размеры метки:
        lbl.setBounds(10, 30, 270, 50);

        // Синий цвет для текста метки:
        lbl.setForeground(Color.BLUE);

        // Рамка вокруг метки:
        lbl.setBorder(BorderFactory.createEtchedBorder());

        // Добавление метки в окно:
        add(lbl);

        // Создание объекта кнопки:
        JButton btn = new JButton("Закрыть окно");

        // Положение и размеры кнопки:
        btn.setBounds(50, 120, 200, 30);

        // Отменяется режим отображения рамки фокуса:
        btn.setFocusPainted(false);

        // Регистрация анонимного обработчика в кнопке:
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        // Добавление кнопки в окно:
        add(btn);

        // Отображение окна на экране:
        setVisible(true);
    }
}
