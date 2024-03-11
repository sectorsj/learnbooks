package ru.sectorsj.java_for_biginners._14_event_handling._525_using_adapters_demo;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.*;

// Класс для создания окна:
class MyFrame extends JFrame {
    // Метка:
    private JLabel L;
    // Текстовое поле:
    private JTextField T;
    // Кнопка:
    private JButton B;

    // Тип шрифта для кнопки:
    private String fontName = "Arial";
    // Размер шрифта для кнопки:
    private int fontSize = 14;
    // Название кнопки:
    private String exitButton = "Закрыть";

    // Конструктор:
    MyFrame(){
        // Вызов конструктора суперкласса:
        super("Окно с текстовым полем");

        // Положение и размеры окна:
        setBounds(250, 250, 300, 165);

        // Реакция на щелчок системной пиктограммы:
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Окно постоянных размеров:
        setResizable(false);

        // Отключение менеджера компоновки:
        setLayout(null);

        // Создание метки:
        L = new JLabel();

        // Положение и размер метки:
        L.setBounds(10, 10, 270, 30);

        // Выделения метки с помощью эффекта вдавливания:
        L.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));

        // Регистрация в метке обработчика
        // для события класса MouseEvent:
        L.addMouseListener(new MouseAdapter() {

            // Метод вызывается, когда курсор оказывается в области метки:
            @Override
            public void mouseEntered(MouseEvent e) {
                // Для метки применяется эффект "поднятия":
                L.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));

                // Применение выравнивания по правому краю
                // для текста в метке:
                L.setHorizontalAlignment(JLabel.RIGHT);
            }

            // Метод вызывается, когда курсор покидает область метки:
            @Override
            public void mouseExited(MouseEvent e) {
                // Применяется эффект "вдавливания" к метке:
                L.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));

                // Применение выравнивания по левому краю
                // для текста в метке:
                L.setHorizontalAlignment(JLabel.LEFT);
            }
        });
        // Создание текстового поля:
        T = new JTextField();

        // Положение и размеры поля:
        T.setBounds(10, 50, 270, 30);

        // Регистрация в поле обработчика
        // для события класса KeyEvent:
        T.addKeyListener(new KeyAdapter() {

            // Метод вызывается при отпускании клавиши на клавиатуре:
            @Override
            public void keyReleased(KeyEvent e) {
                // К метке применяется текст из текстового поля:
                L.setText(T.getText());
            }
        });

        // Создание кнопки:
        B = new JButton(exitButton);

        // Положение и размеры кнопки:
        B.setBounds(60, 90, 175, 30);

        // Отмена режима отображения фокуса для кнопки:
        B.setFocusPainted(false);

        // Шрифт для текста кнопки:
        B.setFont(new Font(fontName, Font.PLAIN, fontSize));

        // Синий цвет для текста кнопки
        B.setForeground(Color.BLUE);

        // Регистрация в кнопке обработчика
        // для события класса ActionEvent:
        B.addActionListener(new ActionListener() {
            // Метод для обработки щелчка на кнопке:
            @Override
            public void actionPerformed(ActionEvent e) {
                // Завершение выполнения программы:
                System.exit(0);
            }
        });

        // Регистрация в кнопке обработчика
        // для события класса MouseEvent:
        B.addMouseListener(new MouseAdapter() {
            // Метод выполняется, когда курсор мыши покидает область кнопки:
            @Override
            public void mouseExited(MouseEvent e) {
                // Текст (обычный) для кнопки:
                B.setText(exitButton);
                // Синий цвет для текста кнопки:
                B.setForeground(Color.BLUE);
                // Шрифт (обычный) для кнопки:
                B.setFont(new Font(fontName, Font.PLAIN, fontSize));
            }
            // Метод вызывается, когда курсор
            // оказывается в области кнопки:
            @Override
            public void mouseEntered(MouseEvent e) {
                // Текст (подчеркнутый) для кнопки:
                B.setText("<html><u>" + exitButton + "</u></html>");
                // Красный цвет для текста кнопки:
                B.setForeground(Color.RED);
                // Шрифт (жирный) для текста кнопки:
                B.setFont(new Font(fontName, Font.BOLD, fontSize + 2));
            }
        });

        // Добавление в окно метки:
        add(L);

        // Добавление поля в окно:
        add(T);

        // Добавление кнопки в окно:
        add(B);

        // Отображение окна:
        setVisible(true);
    }
}
