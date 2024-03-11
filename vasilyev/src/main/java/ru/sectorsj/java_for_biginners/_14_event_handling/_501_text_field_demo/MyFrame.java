package ru.sectorsj.java_for_biginners._14_event_handling._501_text_field_demo;

import javax.swing.*;
import javax.swing.border.*;

// Класс для создания окна
class MyFrame extends JFrame {
    // Метка
    private JLabel L;
    // Текстовое поле:
    private JTextField T;

    // Конструктор

    MyFrame() {
        // Вызов конструктора суперкласса:
        super("Окно с текстовым полем");

        // Значение для размеров окна:
        int w = 300, h = 165;

        // Положение и размеры окна:
        setBounds(250, 250, w, h);

        // Реакция на щелчок системной пиктограммы:
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Окно постоянных размеров:
        setResizable(false);

        // Отключение менеджера компоновки:
        setLayout(null);

        // Создание метки:
        L = new JLabel();

        // Положение и размеры метки:
        L.setBounds(10,10, w - 30, 30);

        // Выделение метки с помощью эффекта вдавливания:
        L.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));

        // Создание текстового поля:
        T = new JTextField();

        // Положение и размер поля:
        T.setBounds(L.getX(),50, L.getWidth(), 30);

        // Ширина кнопки:
        int bw = (T.getWidth() - 20) / 2;

        // Создание первой кнопки:
        JButton appB = new JButton("Применить");

        // Положение и размеры 1й кнопки:
        // T.getX() - положение 1й кнопки по оси Х
        // приравнено к координатами текстовой метки
        appB.setBounds(T.getX(), 90, bw, 30);

        // Отмена режима отображения фокуса:
        // для 1й кнопки:
        appB.setFocusPainted(false);

        // Обработчик события для 1й кнопки:
        appB.addActionListener(e -> L.setText(T.getText()));

        // Создание 2й кнопки:
        JButton extB = new JButton("Закрыть");

        // Положение и размеры 2й кнопки:
        extB.setBounds(appB.getX() + appB.getWidth() + 20, appB.getY(), appB.getWidth(), appB.getHeight());

        // Отмена режима отображения фокуса:
        // для 2й кнопки:
        extB.setFocusPainted(false);

        // Обработчик события для 2й кнопки:
        extB.addActionListener(e -> System.exit(0));

        // Добавление окна метки:
        add(L);

        // Добавление поля в окно:
        add(T);

        //Добавление 1й кнопки в окно:
        add(appB);

        //Добавление 2й кнопки в окно:
        add(extB);

        // Отображение окна:
        setVisible(true);
    }
}
