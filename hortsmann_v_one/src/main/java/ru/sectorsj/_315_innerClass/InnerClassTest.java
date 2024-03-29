package ru.sectorsj._315_innerClass;

import javax.swing.*;

public class InnerClassTest {
    public static void main(String[] args) {
        var clock = new TalkingClock(1000, true);
        clock.start();

        // выполнять программу до тех пор, пока пользователь
        // не щелкнет на экранной кнопке "ОК"
        JOptionPane.showMessageDialog(null, "Выйти из программы?");
        System.exit(0);
    }
}
