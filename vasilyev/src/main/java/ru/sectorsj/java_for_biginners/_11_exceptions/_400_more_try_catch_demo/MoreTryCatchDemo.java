package ru.sectorsj.java_for_biginners._11_exceptions._400_more_try_catch_demo;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class MoreTryCatchDemo {

    public static void main(String[] args) {
        String input;
        char[] symbs;
        int size, index;

        input = showInputDialog(
                null,
                "Указанный размер массива",
                "Символьный массив",
                QUESTION_MESSAGE
        );

        try {
            size = parseInt(input);
            symbs = new char[size];

            String txt = "| ";
            for (int k = 0; k < size; k++) {
                symbs[k] = (char) ('A' + k);
                txt +=symbs[k] + " | ";
            }
            showMessageDialog(
                    null,
                    txt,
                    "Символы из массива",
                    INFORMATION_MESSAGE
            );

            input = showInputDialog(
                    null,
                    "Укажите индекс элемента",
                    QUESTION_MESSAGE
            );

            index = parseInt(input);
            txt = "Индекс - " + index + "\n Символ - " + symbs[index];
            showMessageDialog(
                    null,
                    txt,
                    "Символ",
                    INFORMATION_MESSAGE
            );

        } catch (NumberFormatException e) {
            showMessageDialog(
                    null,
                    "К сожалению возникла ошибка...",
                    "Ошибка",
                    WARNING_MESSAGE
            );
        } catch (NegativeArraySizeException e) {
            showMessageDialog(
                    null,
                    "Не корректный размер массива",
                    "Ошибка при создании массива",
                    ERROR_MESSAGE
            );
        } catch (ArrayIndexOutOfBoundsException e) {
            showMessageDialog(
                    null,
                    "Вы уверены? Такого элемента в созданном Вами массиве, нет!",
                    "Ошибка при выборе индекса",
                    QUESTION_MESSAGE
            );
        }
    }
}
