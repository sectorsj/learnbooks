package ru.sectorsj.java_for_biginners._2_base_types_and_operators._62_input_double_variables_demo;

import javax.swing.*;

public class InputDoubleVariablesDemo {
    public static void main(String[] args) {
        double mass, height, bmi;
        String result;

        result = JOptionPane.showInputDialog("Ваш рост в метрах: ");

        height = Double.parseDouble(result);

        result = JOptionPane.showInputDialog("Ваш вес килограммах: ");

        mass = Double.parseDouble(result);

        bmi = mass/height/height;

        bmi = Math.round(bmi * 100)/100.0;

        JOptionPane.showMessageDialog(null, "Индекс массы тела: " + bmi);
    }
}
