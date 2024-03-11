package ru.sectorsj.java_for_biginners._3_classes_and_objects._86_using_object_demo;

import javax.swing.*;

public class UsingObjectDemo {

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.number = 100;
        obj.symbol = 'A';

        String txt = "Число: " + obj.number + "\n";
        txt += "Символ: " + obj.symbol;

        JOptionPane.showMessageDialog(null, txt);
    }
}
