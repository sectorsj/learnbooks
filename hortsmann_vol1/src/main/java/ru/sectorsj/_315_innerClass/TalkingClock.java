package ru.sectorsj._315_innerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

/**
 Часы, выводящие время через регулярные промежутки
 */
class TalkingClock {
    private int interval;
    private  boolean beep;

    /**
      Конструируем "говорящие часы"
     * @param interval интервал между сообщениями (в миллисекундах)
     * @param beep Истинно, если часы должны издавать звуковой сигнал
     */
    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    public void start() {
        var listener = new TimePrinter();
        var timer = new Timer(interval, listener);
        timer.start();
    }

    public class TimePrinter implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            System.out.println("Сигнал прозвучал в " + Instant.ofEpochMilli(event.getWhen()));
            if (beep) Toolkit.getDefaultToolkit().beep();
        }
    }
}
