package ru.sectorsj._299_lambda;

import javax.swing.*;
import java.util.*;
import javax.swing.Timer;

public class LambdaTest {
    public static void main(String[] args) {
        String[] planets = new String[] {
                "Меркурий",
                "Венера",
                "Земля",
                "Марс",
                "Юпитер",
                "Сатурн",
                "Уран",
                "Нептун",
        };
        System.out.println(Arrays.toString(planets));

        System.out.println("Отсортировано в словарном порядке: ");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));

        System.out.println("Отсортировано по длине слова: ");
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));

        Timer t = new Timer(1000, event ->
                System.out.println("Сейчас " + new Date()));
        t.start();

        // выполнять программу до тех пор,
        // пока пользователь не выберет экранную кнопку "ОК"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}