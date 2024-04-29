package ru.sectorsj._2_base_types_and_operators._57_using_variables_demo;

import javax.swing.*;

public class UsingVariablesDemo {
    public static void main(String[] args) {
        int number = 123;
        double x = 32.1;
        char symb = 'A';
        boolean state = true;
        String text = "Используемые переменные:\n";
        text = text + "Целое число: " + number + "\n";
        text = text + "Действительное число: " + x + "\n";
        text = text + "Символ: " + symb + "\n";
        text = text + "Логическое значение: " + state;
        JOptionPane.showMessageDialog(null, text);
    }
}