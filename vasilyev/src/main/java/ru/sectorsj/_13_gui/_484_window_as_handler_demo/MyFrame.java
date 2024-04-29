package ru.sectorsj._13_gui._484_window_as_handler_demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Класс создания окна
// Реализует интерфейс ActionListener:
class MyFrame extends JFrame implements ActionListener {
    private static final int X = 0;
    private static final int Y = 0;

    // Описание метода из интерфейса ActionListener:
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }

    MyFrame(String name) {
        // Вызов конструктора супер класса:
        super(name);

        // Положение и размеры окна:
        setBounds(250, 250, 300, 200);

        // Окно постоянных размеров:
        setResizable(false);

        // Реакция на щелчок системной пиктограммы:
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Отключение менеджера компоновки:
        setLayout(null);

        // Создание объекта панели:
        JPanel pnl = new JPanel();

        // Положение и размер панели:
        pnl.setBounds(X, Y, 280, 110);

        // Рамка вокруг панели:
        pnl.setBorder(BorderFactory.createEtchedBorder());

        // Отключение менеджера компоновки для панели:
        pnl.setLayout(null);

        // Объект изображения (для отображения в метке):
        ImageIcon img = new ImageIcon("D:\\filesEvgeniy\\my_projects\\coding\\projects\\java\\java_practice\\resources\\giraffe.png");

        // Текстовое значение для отображения в метке:
        String txt = "<html>Это жираф.<br>Он большой.<br>Он все видит.</html>";

        // Создание объекта метки с изображение:
        JLabel imgLbl = new JLabel(img);

        // Положение и размеры метки:
        imgLbl.setBounds(10,10, 90, 90);

        // Рамка вокруг метки:
        imgLbl.setBorder(BorderFactory.createEtchedBorder());

        // Создание объекта для метки с текстом:
        JLabel txtLbl = new JLabel(txt, JLabel.CENTER);

        // Положение и размер метки:
        txtLbl.setBounds(110, 10, 165, 90);

        // Рамка вокруг метки:
        txtLbl.setBorder(BorderFactory.createEtchedBorder());

        // Создание объекта кнопки:
        JButton btn = new JButton("Закрыть окно");

        // Положение и размеры кнопки:
        btn.setBounds(50, 120, 200, 30);

        // Отменяется режим отображения рамки фокуса:
        btn.setFocusPainted(false);

        // Регистрация в кнопке обработчиком
        // объекта окна:
        btn.addActionListener(this);

        // Создание объекта шрифта:
        Font F = new Font(
                // Название шрифта как у кнопки:
                btn.getFont().getName(),
                // Стиль - жирный курсив:
                Font.BOLD|Font.ITALIC,
                // Размер шрифта на 2 больше чем у кнопки:
                btn.getFont().getSize() + 2
        );

        // Применение шрифта к метке с текстом:
        txtLbl.setFont(F);

        // Добавление меток на панель:
        pnl.add(imgLbl);
        pnl.add(txtLbl);

        // Добавление панели в окно:
        add(pnl);

        // Добавление кнопки в окно:
        add(btn);

        // Отображение окна на экране:
        setVisible(true);
    }
}
