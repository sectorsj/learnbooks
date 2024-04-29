package ru.sectorsj._2_base_types_and_operators._60_input_int_variables_demo;

import javax.swing.*;

public class InputIntVariablesDemo {
    public static void main(String[] args) {
        int age, year, birth;
        String result;

        result = JOptionPane.showInputDialog("Какой сейчас год?");
        year = Integer.parseInt(result);

        result = JOptionPane.showInputDialog("Сколько Вам лет?");
        age = Integer.parseInt(result);

        birth = year-age;

        JOptionPane.showMessageDialog(null,"Вы родились в " + birth + "году!");
    }
}
