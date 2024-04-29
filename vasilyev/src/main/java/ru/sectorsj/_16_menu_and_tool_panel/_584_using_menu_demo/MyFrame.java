package ru.sectorsj._16_menu_and_tool_panel._584_using_menu_demo;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

// Класс окна реализует интерфейс ActionListener
class MyFrame extends JFrame implements ActionListener {

    // Поле определяющее изображение и текст,
    // которые следует отображать в окне:
    private int state;
    // Ссылка на панель содержащую изображение
    // и текущую панель:
    private JPanel pnl;
    // Ссылка на объект, определяющий рамку для панелей:
    private Border bdr;
    // Массив со значениями цвета для панели:
    private Color[] clr = new Color[3];
    // Кнопка для закрытия окна:
    private JButton btn;
    // Ссылки пункты меню:
    private JMenu content, view, program;
    // Массив с изображениями:
    private ImageIcon[] imgs;
    // Массивы с названиями животных:
    private String[] engNames = {"fox1", "wolf1", "bear1", "raccoon1"};
    private String[] cyrNames = {"Лиса", "Волк", "Медведь", "Енот"};
    // Массив для записи файлов с текстом:
    private String[] files;
    // Ссылка на метку с изображением:
    private JLabel lbl;
    // Ссылка на текстовую панель:
    private JTextPane tp;
    // Ссылка на панель меню:
    private JMenuBar mb;
    // Ссылка на команды меню:
    private JMenuItem about, exit;
    // Массив со ссылками на команды меню:
    private JMenuItem[] animals;
    // Ссылка на операционную команду меню:
    private JCheckBoxMenuItem color;
    // Ссылки на команды меню, являющиеся переключателями:
    private JRadioButtonMenuItem light, dark, ordinany;
    // Ссылка на панель инструментов;
    private JToolBar tb;
    // Ссылка на кнопки, размещаемые на панели инструментов:
    private MyButton exitBtn, nextBtn, prevBtn, startBtn;
    // Ссылка на контекстное меню:
    private JPopupMenu pm;

    // Внутренний класс для кнопок, размещаемых
    // на панели инструментов:
    class MyButton extends JButton {
        // Конструктор:
        MyButton (String txt) {
            // Вызов конструктора суперкласса:
            super(new ImageIcon("D:\\filesEvgeniy\\my_projects\\coding\\projects\\java\\java_practice\\resources\\files\\" + txt));
            // Отмена рисования рамки фокуса:
            setFocusPainted(false);
        }
    }

    // Метод для установки изображения и текста:
    private void setContent() {
        // Применение изображения к метке:
        lbl.setIcon(imgs[state]);
        // Контролируемый код:
        try{
            // Для текстовой панели применяется:
            // текст из файла:
            tp.setPage(files[state]);
        }
        // Обработка исключения:
        catch (IOException err) {
            tp.setText("Информация недоступна");
        }
    }

    // Реализация метода из интерфейса ActionListener:
    @Override
    public void actionPerformed(ActionEvent e) {
        // Присваивание полю state значением целого числа,
        // которое получается преобразованием из
        // текстового формата команды действия для
        // компонента, на котором произошло событие:
        state = Integer.parseInt(((JMenuItem)e.getSource()).getActionCommand());
        // Вызов метод, устанавливающего изображение в метке
        // и текст в текстовой панели:
        setContent();
    }

    // Конструктор:
    MyFrame() {
        // Вызов конструктора суперкласса:
        super("Окно с панелью меню");
        // Положение и размеры окна:
        setBounds(250, 250, 350, 230);
        // Окно постоянных размеров:
        setResizable(false);
        // Реакция на щелчок системной пиктограммы:
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Применение менеджера компоновки:
        setLayout(new BorderLayout());
        // Начальное значение целочисленного поля:
        state = 0;
        // Тип рамки для панелей:
        bdr = BorderFactory.createEtchedBorder();
        // Используемые цвета:
        clr[0] = getBackground();
        clr[1] = Color.WHITE;
        clr[2] = Color.DARK_GRAY;
        // Массив с изображениями:
        imgs = new ImageIcon[engNames.length];
        // Массив с названиями текстовых файлов:
        files = new String[engNames.length];
        // Массив со ссылками на команды пункта меню:
        animals = new JMenuItem[cyrNames.length];
        // Заполнение массива с изображениями
        // и массива с названиями файлов:
        for (int k = 0; k < engNames.length; k++) {
            imgs[k] = new ImageIcon("D:\\filesEvgeniy\\my_projects\\coding\\projects\\java\\java_practice\\resources\\pictures\\" + engNames[k] + ".jpg");
            files[k] = "file:\\D:\\filesEvgeniy\\my_projects\\coding\\projects\\java\\java_practice\\resources\\files\\" + engNames[k] + ".txt";
        }

        // Создание объекта для панели инструментов:
        tb = new JToolBar("Панель инструментов");
        // Создание объектов для кнопок, размещаемых
        // на панели инструментов и определение для
        // них контекстных подсказок:
        exitBtn = new MyButton("exit.png");
        exitBtn.setToolTipText("Завершение работы");

        startBtn = new MyButton("start.png");
        startBtn.setToolTipText("Начальное изображение");

        prevBtn = new MyButton("prev.png");
        prevBtn.setToolTipText("Предыдущее изображение");

        nextBtn = new MyButton("next.png");
        prevBtn.setToolTipText("Следующее изображение");
        // Добавление кнопок на панель инструментов:
        tb.add(exitBtn);
        tb.add(startBtn);
        tb.add(prevBtn);
        tb.add(nextBtn);

        // Добавление панели инструментов в окно:
        add(tb, BorderLayout.NORTH);

        // Создание панели:
        pnl = new JPanel();
        // Рамка вокруг панели:
        pnl.setBorder(bdr);
        // Определение менеджера компоновки для панели:
        pnl.setLayout(new GridLayout(1, 2));
        // Создание метки:
        lbl = new JLabel();
        // Режим выравнивания содержимого по центру
        lbl.setHorizontalAlignment(JLabel.CENTER);
        // Добавление метки на панель:
        pnl.add(lbl);
        // Добавление панели в окно:
        add(pnl, BorderLayout.CENTER);
        // Область с полосами прокрутки:
        JScrollPane sp = new JScrollPane();
        // Создание текстовой панели:
        tp = new JTextPane();
        // Режим запрещает редактирование содержимого окна:
        tp.setEditable(false);
        // Добавление текстовой панели в область
        // просмотра панели с полосами прокрутки:
        sp.getViewport().add(tp);
        // Добавление панели с полосами прокрутки
        // на обычную панель:
        pnl.add(sp);
        // Создание кнопки:
        btn = new JButton("OK");
        // Отмена режима отображения рамки фокуса:
        btn.setFocusPainted(false);
        // Создание обычной панели:
        JPanel p = new JPanel();
        // Определение менеджера компоновки для панели:
        p.setLayout(new GridLayout(1, 3));
        // Рамка вокруг панели:
        p.setBorder(bdr);
        // Добавление на панель "технической" панели:
        p.add(new JPanel());
        // Добавление на панель кнопки:
        p.add(btn);
        // Добавление на панель "технической" панели:
        p.add(new JPanel());
        // Добавление панели в окно:
        add(p, BorderLayout.SOUTH);
        //Создание панели меню:
        mb = new JMenuBar();
        // Создание пунктов меню:
        content = new JMenu("Содержание");
        view = new JMenu("Вид");
        program = new JMenu("Программа");
        // Создание команд меню:
        about = new JMenuItem("О программе");
        exit = new JMenuItem("Выход", exitBtn.getIcon());
        // Добавление в пункт меню команд:
        program.add(about);
        program.addSeparator(); // Добавление разделителя
        program.add(exit);
        // Создание опционной команды:
        color = new JCheckBoxMenuItem("Цвет панели", true);
        // Создание команд меню, являющихся переключателями:
        light = new JRadioButtonMenuItem("Светлый", false);
        dark = new JRadioButtonMenuItem("Темный", false);
        ordinany = new JRadioButtonMenuItem("Обычный", true);
        // Создание объекта для группы переключателей:
        ButtonGroup bg = new ButtonGroup();
        // Добавление команд-переключателей в группу:
        bg.add(ordinany);
        bg.add(light);
        bg.add(dark);
        // Добавление в пункт меню опционной команды:
        view.add(color);
        // Добавление разделителя:
        view.addSeparator();
        // Добавление в пункт меню команд-переключателей:
        view.add(ordinany);
        view.add(light);
        view.add(dark);
        // Создание команд меню, реализованных через массив:
        for (int k = 0; k < animals.length; k++) {
            // Создание объекта для команды меню:
            animals[k] = new JMenuItem(cyrNames[k]);
            // Определение текста для команды действия:
            animals[k].setActionCommand("" + k);
            // Регистрация обработчика:
            animals[k].addActionListener(this);
            // Добавление команды в пункт меню:
            content.add(animals[k]);
        }

        // Добавление пунктов меню на панель меню:
        mb.add(content);
        mb.add(view);
        mb.add(program);
        // Добавление в окно панели меню:
        setJMenuBar(mb);
        // Создание объекта для контекстного меню:
        pm = new JPopupMenu();
        // Заполнение контекстного меню командами:
        for (int k = 0; k < cyrNames.length; k++) {
            // Добавление команды в контекстное меню
            // с одновременным определением текста для
            // команды действия:
            pm.add(new JMenuItem(cyrNames[k])).setActionCommand("" + k);
            // Регистрация обработчика:
            ((JMenuItem)pm.getComponent(k)).addActionListener(this);
        }

        // Добавление разделителя:
        pm.addSeparator();
        // Добавление команды в контекстное меню
        // с одновременной регистрацией обработчика:
        pm.add(new JMenuItem("Выход", exitBtn.getIcon()))
                .addActionListener(e -> exitBtn.doClick());
        // Регистрация контекстного меню для метки:
        lbl.setComponentPopupMenu(pm);
        btn.addActionListener(e -> System.exit(0));

        // Регистрация обработчика для кнопок на панели
        // инструментов:
        exitBtn.addActionListener(btn.getActionListeners()[0]);

        nextBtn.addActionListener(e ->{
           state = (state + 1) % (engNames.length);
           setContent();
        });

        prevBtn.addActionListener(e -> {
            state = state == 0? engNames.length-1:(state - 1);
            setContent();
        });

        startBtn.addActionListener(e -> {
            state = 0;
            setContent();
        });

        // Регистрация обработчиков для команд меню:
        exit.addActionListener(exitBtn.getActionListeners()[0]);
        about.addActionListener(e -> {
            // Отображение диалогового окна:
            JOptionPane.showMessageDialog(
                    this, // Родительское окно
                    // Текст в области окна (текст сообщения):
                    "В программе используется панель меню\n" +
                            "и панель инструментов.",
                    // Название окна:
                    "О программе",
                    // Тип пиктограммы:
                    JOptionPane.INFORMATION_MESSAGE
            );
        });

        // Регистрация обработчика для метки. При щелчке
        // на правой кнопке мыши в области метки
        // отображается контекстное меню:
        lbl.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                // Проверяем, какая нажата кнопка мыши:
                if (e.isPopupTrigger()) {
                    // Отображение контекстного меню в месте
                    // размещения курсора:
                    pm.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });
        // Регистрация обработчика для опционной команды:
        color.addActionListener(e -> {
            // Если опция установлена:
            if(color.isSelected()) {
                ordinany.setEnabled(true);
                light.setEnabled(true);
                dark.setEnabled(true);
            }
            // Если опция не установлена:
            else {
                ordinany.setEnabled(false);
                light.setEnabled(false);
                dark.setEnabled(false);
            }
        });
        
        // Регистрация обработчиков
        // для команд - переключателей:
        ordinany.addActionListener(e -> pnl.setBackground(clr[0]));
        light.addActionListener(e -> pnl.setBackground(clr[1]));
        dark.addActionListener(e -> pnl.setBackground(clr[2]));

        // Заполнение центральной панели:
        setContent();
        // Отображение окна:
        setVisible(true);
    }
}
