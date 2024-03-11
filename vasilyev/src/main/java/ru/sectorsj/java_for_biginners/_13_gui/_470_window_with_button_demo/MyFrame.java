package ru.sectorsj.java_for_biginners._13_gui._470_window_with_button_demo;

import javax.swing.*;

class MyFrame extends JFrame {

    // Конструктор
    MyFrame(){
        // Вызов супер конструктора
        super("Окно с кнопкой");

        // Положение и размер окна:
        setBounds(250, 250, 300, 200);

        // Окно постоянных размеров:
        setResizable(false);

        // Реакция на щелчок системной пиктограммы:
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Отключение менеджера компоновки:
        setLayout(null);

        //Создание объекта метки(текст):
        JLabel lbl = new JLabel("Щелчок на кнопке приводит к закрытию окна");

        // Положение и размеры метки(текста):
        lbl.setBounds(10, 30, 280, 50);

        // Добавление метки в окно:
        add(lbl);

        // Создание объекта кнопки:
        JButton btn = new JButton("Закрыть окно");

        // Положение и размер кнопки:
        btn.setBounds(50, 120, 200, 30);

        // Создание объекта для обработки событий,
        // происходящего при щелчке кнопки:
        MyHandler hnd = new MyHandler();
        btn.addActionListener(hnd);

        //Добавление кнопки в окно:
        add(btn);

        // Отображение окна на экране:
        setVisible(true);
    }
}
