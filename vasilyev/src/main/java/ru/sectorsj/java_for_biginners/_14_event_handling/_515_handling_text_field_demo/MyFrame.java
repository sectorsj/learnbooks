package ru.sectorsj.java_for_biginners._14_event_handling._515_handling_text_field_demo;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.*;

// Класс для создания окна, реализует интерфейсы
// ActionListener MouseListener KeyListener:
class MyFrame extends JFrame implements ActionListener, MouseListener, KeyListener {
    // Метка
    private JLabel L;
    // Текстовое поле:
    private JTextField T;
    //Кнопка:
    private JButton B;

    // Тип шрифта для кнопки:
    private String fontName = "Arial";

    // Размер шрифта для кнопки:
    private int fontSize = 15;

    // Название кнопки:
    private String exitButton = "Закрыть";

    // Метод для обработки щелчка на кнопке:
    @Override
    public void actionPerformed(ActionEvent e) {
        // Завершение выполнения:
        System.exit(0);
    }

    // Метод выполняется, когда курсор мыши
    // покидает область компонента:
    @Override
    public void mouseExited(MouseEvent e) {
        // Если событие произошло на метке:
        if (e.getSource()==L) {
            // Применение эффекта "вдавливания" к метке:
            L.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));

            // Применение выравнивания по левому краю
            // для текста в метке:
            L.setHorizontalAlignment(JLabel.LEFT);
        } // Если событие произошло на кнопке:
        else {
            // Текст обычный для кнопки:
            B.setText(exitButton);
            // Синий цвет для текста кнопки:
            B.setForeground(Color.BLUE);
            // Шрифт (обычный) для кнопки:
            B.setFont(new Font(fontName, Font.PLAIN, fontSize));
        }
    }

    // Метод вызывается, когда курсор
    // оказывается в поле области компонента:
    @Override
    public void mouseEntered(MouseEvent e) {
        // Если событие произошло на метке:
        if(e.getSource() == L) {
            // Для метки применяется эффект "поднятия":
            L.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));

            // Применение выравнивания по правому краю для текста в метке:
            L.setHorizontalAlignment(JLabel.RIGHT);
        } // Если событие произошло на кнопке:
        else {
            // Текст (подчеркнутый) для кнопки:
            B.setText("<html><u>" + exitButton + "</u></html>");
            // Красный цвет для текста кнопки:
            B.setForeground(Color.RED);
            // Шрифт (жирный) для теста кнопки:
            B.setFont(new Font(fontName, Font.BOLD, fontSize + 2));
        }
    }
    // Методы из интерфейса MouseListener с пустой реализацией:
    @Override
    public void mouseClicked(MouseEvent e) {}
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e){}

    // Метод при отпускании клавиши на клавиатуре:
    @Override
    public void keyReleased(KeyEvent e) {
        // К метке применяется текст из тестового поля:
        L.setText(T.getText());
    }

    // Методы из интерфейса KeyListener с пустой реализацией:
    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyPressed(KeyEvent e) {}

    // Конструктор:
    MyFrame() {
        // Вызов конструктора суперкласса:
        super("Окно с текстовым полем");

        // Положение и размеры окна:
        setBounds(250,250, 300, 165);

        // Реакция на щелчок системной пиктограммы:
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Окно постоянных размеров:
        setResizable(false);

        // Отключение менеджера компоновки:
        setLayout(null);

        // Создание метки:
        L = new JLabel();

        // Положение и размеры метки:
        L.setBounds(10, 10, 270, 30);

        // Выделение в метки с помощью эффекта "вдавливания":
        L.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));

        // Регистрация в метке обработчика для события класса MouseEvent:
        L.addMouseListener(this);

        // Создание текстового поля:
        T = new JTextField();

        // Положение и размер поля:
        T.setBounds(10, 50, 270, 30);

        // Регистрация в поле обработчика
        // для события класса KeyEvent:
        T.addKeyListener(this);

        // Создание кнопки:
        B = new JButton(exitButton);

        // Положение и размеры кнопки:
        B.setBounds(60, 90, 175, 30);

        // Отмена режима отображения фокуса для кнопки:
        B.setFocusPainted(false);

        // Шрифт для текста кнопки:
        B.setFont(new Font(fontName, Font.PLAIN, fontSize));

        // Шрифт для текста кнопки:
        B.setForeground(Color.BLUE);

        // Регистрация в кнопке обработчика
        // для события класса ActionEvent:
        B.addActionListener(this);

        // Регистрация в кнопке обработчика
        // для события класса MouseEvent:
        B.addMouseListener(this);

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
