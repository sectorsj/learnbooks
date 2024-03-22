package ru.sectorsj._287_timer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

public class TimerTest {
    public static void main(String[] args) {
        var listener = new TimePrinter();

        // построение таймера, вызывающего приемник событий каждую секунду
        var timer = new Timer(1000, listener);
        timer.start();

        // продолжение выполнение программы до тех пор,
        // пока пользователь не выберет экранную кнопку "ОК".
        JOptionPane.showMessageDialog(null, "Выйти из программы?");
        System.exit(0);
    }
}

class TimePrinter implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("Время по звуковому сигналу " + Instant.ofEpochMilli(event.getWhen()));
        Toolkit.getDefaultToolkit().beep();
    }
}