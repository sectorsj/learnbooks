package ru.sectorsj.java_for_biginners._15_graphic_components._532_using_combo_box_demo;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

// Класс для создания объекта реализует
// интерфейс ItemListener:
class MyFrame extends JFrame implements ItemListener {
    // Раскрывающийся список:
    private JComboBox CB;
    // Кнопка:
    private JButton B;
    // Метка:
    private  JLabel L;
    // Массив с названиями животных:
    private String[] animals = new String[]{"Лиса", "Волк", "Медведь", "Енот"};
    // Массив с названиями файлов с изображениями:
    private String[] files = new String[]{"fox1.jpg", "wolf1.jpg", "bear1.jpg", "raccoon1.jpg"};
    //Путь к каталогу с изображениями:
    private String path = "D:\\filesEvgeniy\\my_projects\\coding\\projects\\java\\java_practice\\resources\\";
    // Массив с изображениями:
    private ImageIcon[] imgs;

    // Метод вызывается при изменении состояния списка:
    @Override
    public void itemStateChanged(ItemEvent e) {
        // Метке присваивается новое изображение:
        L.setIcon(imgs[CB.getSelectedIndex()]);
    }

    // Конструктор:
    MyFrame() {
        // Настройка параметров окна:
        super("Раскрывающийся список");
        setBounds(250, 250, 300, 160);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);

        // Создание массива из ссылок на объекты изображений:
        imgs = new ImageIcon[files.length];

        // Создание объектов изображений
        // и заполнение массива:
        for (int k = 0; k < imgs.length; k++) {
            imgs[k] = new ImageIcon(path + files[k]);
        }

        // Создание метки с изображением:
        L = new JLabel(imgs[0]);
        // Положение и размеры метки:
        L.setBounds(10, 10, 150, 100);

        // Добавление метки в окно:
        add(L);

        // Создание и добавление в окно метки с текстом:
        JLabel lbl = new JLabel("Сделайте выбор:");

        lbl.setBounds(170, 10, 110, 20);
        add(lbl);

        // Создание раскрывающегося списка:
        CB = new JComboBox(animals);
        CB.setBounds(170, 40, 110, 30);

        // В списке выбирается начальный пункт:
        CB.setSelectedIndex(0);

        // Регистрация обработчика в списке:
        CB.addItemListener(this);

        // Добавление списка в окно:
        add(CB);

        // Создание кнопки "OK":
        B = new JButton("OK");

        // Положение и размеры кнопки:
        B.setBounds(170, 80, 110, 30);

        // Регистрация обработчика в кнопке:
        B.addActionListener(e -> System.exit(0));

        // Добавление кнопки в окно:
        add(B);

        // Отображение окна на экране:
        setVisible(true);
    }
}