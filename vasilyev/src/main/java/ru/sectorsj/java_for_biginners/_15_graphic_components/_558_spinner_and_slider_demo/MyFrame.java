package ru.sectorsj.java_for_biginners._15_graphic_components._558_spinner_and_slider_demo;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Hashtable;

// Класс для создания объекта окна реализует
// интерфейсы ItemListener ChangeListener:
public class MyFrame extends JFrame implements ItemListener, ChangeListener {
    // Спиннер:
    private JSpinner SP;
    // Ссылка на объект редактора для спиннера:
    private JSpinner.DefaultEditor editor;
    // Название для шрифта спиннера:
    private String name = "Arial";
    // Размер шрифта спиннера:
    private int size = 14;
    // Слайдер:
    private JSlider SL;
    // Опционная кнопка:
    private JToggleButton TB;
    // Название для опционной кнопки:
    private String pressed = "Заблокировать";
    private String unpressed = "Разблокировать";
    // Ссылки на пиктограммы для опционной кнопки:
    private ImageIcon locked, unlocked;
    // Опции:
    private JCheckBox IT, BL;
    // Кнопка:
    private JButton B;
    // Метка:
    private JLabel L;
    // Массив с названиями животных:
    private String[] animals = new String[]{"Лиса", "Волк", "Медведь", "Енот"};
    // Массив с названиями файлов с изображениями:
    private String[] files = new String[] {"fox.jpg", "wolf.jpg", "bear.jpg", "raccoon.jpg"};
    // Путь к каталогу с изображениями:
    private String path = "D:\\filesEvgeniy\\projects\\mycoding\\java\\books\\vasilyev\\src\\main\\resources\\pictures\\";
    // Массив с изображениями:
    private  ImageIcon[] imgs;
    // Закрытый метод для определения шрифта спиннера:
    private void setSpinnerFont() {
        // Переменная для определения стиля шрифта
        int style = Font.PLAIN;

        // Если установлена опция для применения курсива:
        if (IT.isSelected()) {
            style |= Font.ITALIC;
        }
        // Если установлена опция для применения жирного шрифта:
        if (BL.isSelected()) {
            style |= Font.BOLD;
        }
        // Применение шрифта к полю спиннера:
        editor.getTextField().setFont(new Font(name, style, size));
    }
    // Метод вызывается при изменении состояния опций:
    @Override
    public void itemStateChanged(ItemEvent e) {
        // Определение шрифта для спиннера:
        setSpinnerFont();
    }

    // Метод вызывается для обработки событий, связанных
    // с изменением состояния спиннера и слайдера:
    @Override
    public void stateChanged(ChangeEvent e) {
        // Локальная целочисленная переменная:
        int k;
        // Локальная текстовая переменная:
        String s;
        // Если событие произошло на спиннере:
        if (e.getSource() == SP) {
            // Считывание значения в поле спиннера:
            s = (String) SP.getValue();

            // Определение индекса выбранного пункта:
            for (k = 0; k < animals.length; k++) {
                if (animals[k].equals(s)) {
                    // Присваивание значения слайдеру:
                    SL.setValue(k);
                    // Завершение оператора цикла:
                    break;
                }
            }
        }
        else { // Если событие произошло на слайдере:
            k = SL.getValue();

            // Присваивание значения для спиннера:
            SP.setValue(animals[k]);
        }

        // Изменение изображения:
        L.setIcon(imgs[k]);
    }

    // Конструктор:
    MyFrame() {
        // Настройка параметров окна:
        super("Спиннер и слайдер");
        setBounds(250, 250, 400, 220);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);

        // Создание панели:
        JPanel pnl = new JPanel();
        // Отключение менеджера компоновки панели:
        pnl.setLayout(null);
        // Положение и размер панели:
        pnl.setBounds(10, 10, 170, 165);
        // Рамка вокруг панели:
        pnl.setBorder(BorderFactory.createEtchedBorder());

        // Создание массива из ссылок на объекты изображений:
        imgs = new ImageIcon[files.length];

        // Создание объектов изображений и заполнение массива:
        for (int k = 0; k < imgs.length; k++) {
            imgs[k] = new ImageIcon(path + files[k]);
        }
        // Создание метки с изображением:
        L = new JLabel(imgs[0]);
        // Положение и размеры метки:
        L.setBounds(10, 10, 150, 100);
        // Добавление метки на панель:
        pnl.add(L);

        // Создание кнопки:
        B = new JButton("OK");
        // Положение и размеры кнопки:
        B.setBounds(10, 125, 150, 30);
        // Регистрация обработчика в кнопке:
        B.addActionListener(e -> System.exit(0));
        // Добавление кнопки на панель:
        pnl.add(B);
        // Добавление панели в окно:
        add(pnl);

        // Создание панели со вкладками:
        JTabbedPane tp = new JTabbedPane();
        // Положение и размер панели со вкладками:
        tp.setBounds(190, 10, 190, 165);

        // Создание панели:
        JPanel one = new JPanel();
        // Отключение менеджера компоновки панели:
        one.setLayout(null);
        // Создание объекта модели спиннера:
        SpinnerModel sm = new SpinnerListModel(animals);

        // Создание объекта спиннера:
        SP = new JSpinner(sm);
        // Положение и размеры спиннера:
        SP.setBounds(5, 5, 170, 30);
        // Положение ссылки на объект редактора для спиннера:
        editor = (JSpinner.DefaultEditor) SP.getEditor();
        // Выравнивание содержимого поля спиннера по центру:
        editor.getTextField().setHorizontalAlignment(JTextField.CENTER);
        // Переход в режим "Запрета редактирования"
        // содержимого поля спиннера:
        editor.getTextField().setEditable(false);
        // Устанавливается значение спиннера:
        SP.setValue(animals[0]);
        // Регистрация обработчика для спиннера:
        SP.addChangeListener(this);
        // Добавление спиннера на панель:
        one.add(SP);

        // Создании опции (применение курсивного шрифта):
        IT = new JCheckBox("Курсивный шрифт");
        // Положение и размеры опции:
        IT.setBounds(5, 35, 170, 25);
        // Регистрация обработчика в опции:
        IT.addItemListener(this);
        // Добавление опции (применение курсива) на панель:
        one.add(IT);

        // Создание опции (применение жирного шрифта):
        BL = new JCheckBox("Жирный шрифт");
        // Положение и размеры опции:
        BL.setBounds(5, 65, 170, 25);
        // Установка флажка на опцию:
        BL.setSelected(true);
        // Регистрация обработчика:
        BL.addItemListener(this);
        // Добавление опции на панель:
        one.add(BL);

        // Создание опционной кнопки:
        TB = new JToggleButton(unpressed);
        // Положение и размеры опционной кнопки:
        TB.setBounds(5, 95, 170, 40);

        // Создание объектов изображений для опционной кнопки:
        locked = new ImageIcon(path + "locked.png");
        unlocked = new ImageIcon(path + "unlocked.png");

        // Пиктограмма для опционной кнопки (если она не нажата):
        TB.setIcon(locked);
        // Пиктограмма для опционной кнопки (если она нажата):
        TB.setSelectedIcon(unlocked);
        // Регистрация обработчика для опционной кнопки:
        TB.addActionListener(e -> {
            // Если опционная кнопка нажата:
            if (TB.isSelected()) {
                // Текст для кнопки:
                TB.setText(pressed);
                // Режим разрешающий редактирование
                // содержимого в поле спиннера:
                editor.getTextField().setEditable(true);
            } // Если опционная кнопка не нажата:
            else {
                // Текст для кнопки:
                TB.setText(unpressed);
                // Режим, запрещающий редактирование
                // содержимого в поле спиннера:
                editor.getTextField().setEditable(false);
            }
        });

        // Добавление кнопки на панель:
        one.add(TB);
        // Применение шрифта спиннера:
        setSpinnerFont();
        // Добавление панели на панель со
        // вкладками (в качестве 1й вкладки):
        tp.add("Спиннер", one);

        // Создание панели:
        JPanel two = new JPanel();
        // Отключение менеджера компоновки панели:
        two.setLayout(null);

        // Создание слайдера:
        SL = new JSlider(JSlider.VERTICAL, 0, 3, 1);
        // Положение и размеры слайдера:
        SL.setBounds(5, 5, 100, 120);
        // Создание объекта для реализации таблицы
        // подстановок подписей для слайдера:
        Hashtable ht =  new Hashtable();
        // Заполнение таблицы подстановок:
        for (int k = 0; k < animals.length; k++) {
            ht.put(new Integer(k), new JLabel(animals[k]));
        }
        // Применение таблицы подстановок для подписей:
        SL.setLabelTable(ht);
        // Инверсный способ  отображения шкалы для слайдера:
        SL.setInverted(true);
        // Интервал между основными засечками:
        SL.setMajorTickSpacing(1);
        // Отображение засечек:
        SL.setPaintTicks(true);
        // Отображение подписей:
        SL.setPaintLabels(true);
        // Установка  значения для слайдера:
        SL.setValue(0);
        // Регистрация обработчика для слайдера:
        SL.addChangeListener(this);
        // Добавление слайдера на панель:
        two.add(SL);
        // Добавление панели на панель
        // со вкладками (в качестве 2й вкладки):
        tp.add("Слайдер", two);
        // Добавление панели со вкладками в окно:
        add(tp);
        // Отображение окна на экране:
        setVisible(true);
    }
}
