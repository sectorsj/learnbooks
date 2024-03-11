package ru.sectorsj.java_for_biginners._14_event_handling._508_more_text_field_demo;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

// Класс для создания окна реализует
// интерфейсы ActionListener и MouseListener:
class MyFrame extends JFrame implements ActionListener, MouseListener {
    // Метка:
    private JLabel L;

    // Текстовое поле:
    private JTextField T;

    // Название кнопок:
    private String apply = "Применить";
    private String exit = "Закрыть";

    // Метод для обработки щелчка на кнопке:

    @Override
    public void actionPerformed(ActionEvent e) {
        // Определение названия кнопки, на которой
        // произошло событие:
        String txt = e.getActionCommand();
        // Если кнопка "Применить":
        if (txt.equals(apply)) {
            // Присваивание текста из поля метка:
            L.setText(T.getText());
        } // Если кнопка "Закрыть":
        else {
            // Завершение выполнения программы:
            System.exit(0);
        }
    }

    // Метод выполняется, когда курсор мыши покидает
    // область компонента:
    @Override
    public void mouseExited(MouseEvent e) {
        // Применение эффекта "вдавливания" к метке:
        L.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));

        // Применение выравнивание по левому краю
        // для текста в метке:
        L.setHorizontalAlignment(JLabel.LEFT);
    }
    // Метод вызывается, когда курсор
    // оказывается над область компонента:
    @Override
    public void mouseEntered(MouseEvent e) {
        // К метке применение эффекта "поднятия":
        L.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        // Применение выравнивания по правому краю
        // для текста в метке:
        L.setHorizontalAlignment(JLabel.RIGHT);
    }

    // Метод из интерфейса MouseListener
    // c пустой реализацией:
    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    // Конструктор:
    MyFrame(){
        // Вызов конструктора супер класса:
        super("Окно с текстовым полем");

        // Значение для размеров окна:
        int w = 300, h = 165;

        // Положение и размеры окна:
        setBounds(250, 250, w, h);

        // Реакция на щелчок системной пиктограммы:
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Окно постоянных размеров:
        setResizable(false);

        // Отключение менеджера компоновки:
        setLayout(null);

        // Создание экземпляра метки:
        L = new JLabel();

        // Положение и размеры метки:
        L.setBounds(10, 10, w - 30, 30);

        // Выделение метки с помощью эффекта "вдавливания":
        L.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));

        // Регистрация обработчика в метке:
        L.addMouseListener(this);

        // Создание текстового поля:
        T = new JTextField();

        // Положение и размеры поля:
        T.setBounds(L.getX(), 50, L.getWidth(), 30);

        // Ширина кнопки:
        int bw = (T.getWidth()- 20) / 2;

        // Создание кнопки "Применить":
        JButton appB = new JButton(apply);

        // Положение и размеры кнопки "Применить":
        appB.setBounds(T.getX(), 90, bw, 30);

        // Отмена режима отображения фокуса:
        // для кнопки "Применить":
        appB.setFocusPainted(false);

        // Регистрация объекта окна
        // обработчиком события для кнопки "Применить":
        appB.addActionListener(this);

        // Создание кнопки "Закрыть":
        JButton extB = new JButton(exit);

        // Положение и размеры кнопки "Закрыть":
        extB.setBounds(appB.getX() + appB.getWidth() + 20, appB.getY(), appB.getWidth(), appB.getHeight());

        // Отмена режима отображения фокуса
        // для кнопки "Закрыть":
        extB.setFocusPainted(false);

        // Регистрация объекта окна обработчиком
        // события для кнопки "Закрыть":
        extB.addActionListener(this);

        // Добавление в окно метки:
        add(L);

        // Добавление поля в окно:
        add(T);

        // Добавление кнопки "Применить":
        add(appB);

        // Добавление кнопки "Закрыть":
        add(extB);

        // Отображение окна:
        setVisible(true);
    }
}
