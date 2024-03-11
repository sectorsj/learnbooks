package ru.sectorsj.java_for_biginners._11_exceptions._394_try_catch_example_demo;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

class TryCatchExampleDemo {

    public static void main(String[] args) {
        String input;
        int num;

        input = showInputDialog(
                null,
                "Введите число,",
                "Число",
                QUESTION_MESSAGE
        );

        try {
            num = parseInt(input);
            showMessageDialog(
                    null,
                    "Числа " + (num - 1) + ", " + num + " и " + (num + 1),
                    "Числа",
                    INFORMATION_MESSAGE
            );
        } catch (Exception e) {
            showMessageDialog(
                    null,
                    "Что пошло не так...",
                    "Ошибка",
                    ERROR_MESSAGE
            );
        }
    }
}
