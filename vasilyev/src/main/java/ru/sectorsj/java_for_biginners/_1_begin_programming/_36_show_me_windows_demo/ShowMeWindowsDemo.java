package ru.sectorsj.java_for_biginners._1_begin_programming._36_show_me_windows_demo;

import javax.swing.*;

public class ShowMeWindowsDemo {
    public static void main(String[] args) {
        String title;
        String text;
        title = JOptionPane.showInputDialog(null, "Имя для окна", "Название", JOptionPane.WARNING_MESSAGE);
        text = JOptionPane.showInputDialog(null, "Текст сообщения", "Содержание", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, text, title, JOptionPane.INFORMATION_MESSAGE);
    }
}
