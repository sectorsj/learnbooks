package ru.sectorsj._324_anonymousInnerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

/**
 Часы, выводящие время через регулярные промежутки
 */
public class TalkingClock {

    /**
     Запускаем часы
     * @param interval  Интервал между сообщениями (в миллисекундах)
     * @param beep      Истинно, если часы должны издавать звуковой сигнал
     */
    public void start(int interval, boolean beep){
        var listener = new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.out.println("Сигнал прозвучал в " + Instant.ofEpochMilli(event.getWhen()));
                if (beep) Toolkit.getDefaultToolkit().beep();
            }
        };
        var timer = new Timer(interval, listener);
        timer.start();
    }
}
