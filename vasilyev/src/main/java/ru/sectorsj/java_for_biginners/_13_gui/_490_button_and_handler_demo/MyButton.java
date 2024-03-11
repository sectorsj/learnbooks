package ru.sectorsj.java_for_biginners._13_gui._490_button_and_handler_demo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Класс кнопки:
class MyButton extends JButton implements ActionListener {
    // Описание метода из интерфейса ActionPerformed:
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }

    // Конструктор
    MyButton(int x, int y, int w, int h) {
        // Вызов конструктора суперкласса:
        super("Закрыть окно");

        // Положение и размеры кнопки:
        setBounds(x, y, w, h);

        // Отмена отображения рамки фокуса:
        setFocusPainted(false);

        // Регистрация обработчика в кнопке:
        addActionListener(this);
    }
}
