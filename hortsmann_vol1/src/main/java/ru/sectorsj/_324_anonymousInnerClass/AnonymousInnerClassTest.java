package ru.sectorsj._324_anonymousInnerClass;

import javax.swing.*;

public class AnonymousInnerClassTest {
    public static void main(String[] args) {
        var clock = new TalkingClock();
        clock.start(1000, true);

        // выполнять программу до тех пор, пока пользователь
        // не щелкнет на экранной кнопке "ОК"
        JOptionPane.showMessageDialog(null, "Выйти из программы?");
        System.exit(0);
    }
}
