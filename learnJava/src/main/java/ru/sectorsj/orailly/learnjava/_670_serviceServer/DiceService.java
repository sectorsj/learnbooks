package ru.sectorsj.orailly.learnjava._670_serviceServer;

import javax.swing.*;
import java.awt.event.*;

public class DiceService implements Service {
    JLabel label;           // объявляется переменная для отображения значений бросков кубика
    JComboBox numOfDice;    // объявляется переменная для выбора количества кубиков

    // Переопределение метода getGuiPanel() из интерфейса Service.
    // Метод создает и возвращает панель для графического интерфейса.
    @Override
    public JPanel getGuiPanel() {
        JPanel panel = new JPanel();                         // Создание новой панели для компонентов интерфейса.
        JButton button = new JButton("Roll 'em!");      // Создание кнопки "Roll 'em!" для броска кубиков.
        String[] choices = {"1", "2", "3", "4", "5"};        // Массив строк, представляющих возможные варианты выбора количества кубиков.
        numOfDice = new JComboBox(choices);                  // Инициализация комбо-бокса numOfDice с выбором количества кубиков.
        label = new JLabel("Dice values here");         // Инициализация метки label для отображения значений бросков кубиков.
        button.addActionListener(new RollEmListener());      // Добавление слушателя действия к кнопке 'Roll em!' для обработки событий нажатия на кнопку.
        panel.add(numOfDice);                                // Добавление компонентов на панель комбо-бокса numOfDice
        panel.add(button);                                   // Добавление компонентов на панель кнопки button
        panel.add(label);                                    // Добавление компонентов на панель метки label.
        return panel;                                        // Возврат панели с графическим интерфейсом.
    }

    // Внутренний класс RollEmListener, который реализует интерфейс ActionListener
    // для обработки событий нажатия на кнопку.
    private class RollEmListener implements ActionListener {

        // Переопределение метода actionPerformed, который будет вызываться при нажатии на кнопку.
        @Override
        public void actionPerformed(ActionEvent e) {
            // Бросаем кости:
            String diceOutput = "";                                     // Объявление переменной для хранения результатов бросков кубиков
            String selection = (String) numOfDice.getSelectedItem();    // Объявление переменной для выбора количества кубиков из комбо-бокса
            int numOfDiceToRoll = Integer.parseInt(selection);          // Преобразование выбранного количества кубиков в целое число.
            for (int i = 0; i < numOfDiceToRoll; i++) {                 // Цикл для броска кубиков заданное количество раз.
                int r = (int) ((Math.random() * 6) + 1);                // Генерация случайного числа в диапазоне от 1 до 6 - результат броска кубика.
                diceOutput += (" " + r);                                // Добавление значения броска кубика к строке diceOutput (результаты бросков кубиков).
            }
            label.setText(diceOutput);                                  // Установка текста метки label на основе результатов бросков кубиков.
        }
    }
}