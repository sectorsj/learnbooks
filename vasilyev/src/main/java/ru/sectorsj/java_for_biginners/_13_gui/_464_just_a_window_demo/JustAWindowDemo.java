package ru.sectorsj.java_for_biginners._13_gui._464_just_a_window_demo;

import javax.swing.*;

public class JustAWindowDemo {
    // Главный метод:
    public static void main(String[] args) {
        // Создание объектов окна:
        JFrame window = new JFrame("Обычное окно");

        // Размер окна:
        window.setSize(300, 200);

        // Положение окна на экране:
        window.setLocation(250, 250);

        // Альтернатива двум setSize() и setLocation()
        // метод setBounds(положение х, положение у, ширина, высота)
        //window.setBounds(250, 250, 300, 200);

        // Окно постоянных размеров:
        window.setResizable(false);

        // Реакция на щелчок системной пиктограммы:
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Отображение окна на экране:
        window.setVisible(true);
    }
}
