package ru.sectorsj._15_graphic_components._541_using_list_demo;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

// Класс для создания объекта окна
// реализует интерфейс ListSelectionListener:
class MyFrame extends JFrame implements ListSelectionListener {
    // Список выбора:
    private JList LS;
    // Кнопка:
    private JButton B;
    // Метка:
    private JLabel L;
    // Массив с названиями животных:
    private String[] animals = new String[]{"Лиса", "Волк", "Медведь", "Енот"};
    // Массив с названиями файлов и изображений:
    private String[] files = new String[]{"fox1.jpg", "wolf1.jpg", "bear1.jpg", "raccoon1.jpg"};
    // Путь к каталогу с изображениями:
    private String path = "D:\\filesEvgeniy\\my_projects\\coding\\projects\\java\\java_practice\\resources\\";
    // Массив с изображениями:
    private ImageIcon[] imgs;

    // Метод вызывается при изменении
    // состояния списка выбора:
    @Override
    public void valueChanged(ListSelectionEvent e) {
        // Метке присваивается новое изображение:
        L.setIcon(imgs[LS.getSelectedIndex()]);
    }

    // Конструктор:
    MyFrame() {
        // Настройки параметров окна:
        super("Список выбора");
        setBounds(250, 250, 300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);

        // Создание массива из ссылок на объекты изображений:
        imgs = new ImageIcon[files.length];
        // Создание объектов изображений и заполнение массива:
        for (int k = 0; k < imgs.length; k++) {
            imgs[k] = new ImageIcon (path + files[k]);
        }

        // Создание метки:
        L = new JLabel(imgs[0]);
        // Положение и размеры метки:
        L.setBounds(10, 10, 160, 100);
        // Добавление метки в окно:
        add(L);

        // Создание и добавление в окно метки с текстом:
        JLabel lbl = new JLabel("Сделай выбор");
        lbl.setBounds(170, 10, 110, 20);
        add(lbl);

        // Создание списка выбора:
        LS = new JList(animals);
        // Положение и размеры списка:
        LS.setBounds(170, 35, 110, 75);

        // Регистрация обработчика в списке:
        LS.addListSelectionListener(this);

        // Переход в режим выбора только одного элемента списка:
        LS.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // В списке выбирается начальный элемент:
        LS.setSelectedIndex(0);

        // Добавление списка выбора в окно:
        add(LS);

        // Создание кнопки:
        B = new JButton("OK");

        // Положение и размеры кнопки:
        B.setBounds(90, 120, 110, 30);

        // Регистрация обработчика в кнопке:
        B.addActionListener(e -> System.exit(0));

        // Добавление кнопки в окно:
        add(B);

        // Отображение окна на экране:
        setVisible(true);
    }
}
