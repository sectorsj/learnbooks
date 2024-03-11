package ru.sectorsj.orailly.learnjava._670_serviceServer;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.text.*;

// Класс, реализующий интерфейс Service
public class DayOfTheWeekService implements Service {
    JLabel outputLabel; // Метка для вывода результата
    JComboBox month;    // Выпадающий список для выбора месяца
    JTextField day;     // Поле ввода для дня
    JTextField year;    // Поле ввода для года

    // Метод для получения графической панели
    @Override
    public JPanel getGuiPanel() {
        JPanel panel = new JPanel();                         // Создание панели
        JButton button = new JButton("Do it!");         // Создание кнопки
        button.addActionListener(new DoItListener());        // Добавление слушателя событий для кнопки
        outputLabel = new JLabel("date appears here");  // Инициализация метки

        DateFormatSymbols dateStuff = new DateFormatSymbols();  // Создание объекта для работы с символами даты
        month = new JComboBox(dateStuff.getMonths());           // Создание выпадающего списка с месяцами
        day = new JTextField(8);                        // Создание поля ввода для дня
        year = new JTextField(8);                       // Создание поля ввода для года

        JPanel inputPanel = new JPanel(new GridLayout(3, 2));   // Создание панели ввода с сеткой 3x2

        inputPanel.add(new JLabel("Month"));    // Добавление метки для месяца в панель ввода
        inputPanel.add(month);  // Добавление выпадающего списка месяцев в панель ввода

        inputPanel.add(new JLabel("Day"));      // Добавление метки для дня в панель ввода
        inputPanel.add(day);    // Добавление поля ввода дня в панель ввода

        inputPanel.add(new JLabel("Year"));     // Добавление метки для года в панель ввода
        inputPanel.add(year);   // Добавление поля ввода года в панель ввода

        panel.add(inputPanel);  // Добавление панели ввода на основную панель
        panel.add(button);      // Добавление кнопки на основную панель
        panel.add(outputLabel); // Добавление метки на основную панель

        return panel;   // Возвращение основной панели
    }

    // Внутренний класс для обработки событий кнопки "Do it!"
    public class DoItListener implements ActionListener{

        // Метод, вызываемый при нажатии на кнопку
        @Override
        public void actionPerformed(ActionEvent e) {
            int monthNum = month.getSelectedIndex();        // Получение индекса выбранного месяца
            int dayNum = Integer.parseInt(day.getText());   // Получение значения дня из поля ввода
            int yearNum = Integer.parseInt(year.getText()); // Получение значения года из поля ввода
            Calendar calendar = Calendar.getInstance();     // Получение объекта Calendar
            calendar.set(Calendar.MONTH, monthNum);         // Установка месяца
            calendar.set(Calendar.DAY_OF_MONTH, dayNum);    // Установка дня месяца
            calendar.set(Calendar.YEAR,yearNum);            // Установка года
            Date date = calendar.getTime();                 // Получение объекта Date
            String dayOfWeek = (new SimpleDateFormat("EEEE")).format(date); // Форматирование даты для получения дня недели
            outputLabel.setText(dayOfWeek);                 // Установка текста метки на день недели
        }
    }
}