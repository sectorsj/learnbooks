package ru.sectorsj.orailly.learnjava._681_beatBoxRefactor;

import javax.sound.midi.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.Socket;
import java.util.*;

// Класс BeatBoxFinal отвечает за основную логику приложения
public class BeatBoxRefactor {

    JFrame theFrame;    // Главное окно приложения
    JPanel mainPanel;   // Панель, на которой размещаются элементы интерфейса
    JList incomingList; // Список для отображения входящих сообщений
    JTextField userMessage; // Поле ввода сообщения пользователя
    ArrayList <JCheckBox> checkboxList; // Список флажков для управления музыкальными треками
    int nextNum;    // Переменная для хранения следующего номера сообщения
    Vector<String> listVector = new Vector<>(); // Вектор для хранения строк списка входящих сообщений
    String userName;    // Имя пользователя
    ObjectOutputStream out; // Поток для отправки данных по сети
    ObjectInputStream in;   // Поток для приема данных по сети
    HashMap<String, boolean[]> otherSeqsMap = new HashMap<>();  // Хранит последовательности других пользователей
    Sequencer sequencer;    // Объект для воспроизведения MIDI
    Sequence sequence;  // Последовательность MIDI-событий
    Sequence mySequence = null; // Последовательность MIDI-событий для данного пользователя
    Track track;    // Трек MIDI-событий

    // Названия инструментов
    String[] instrumentNames = {
            "Bass Dram", "Closed Hi-Hat", "Open Hi-Hat",
            "Acoustic Snare", "Crash Cymbal", "Hand Clap",
            "High Tom", "Hi bongo", "Maracas",
            "Whistle", "Low Conga", "Cowbell",
            "Vibraslap", "Low-mid Tom", "High Agogo",
            "Open Hi Conga"
    };

    // MIDI-номера инструментов
    int[] instruments = {35, 42, 46, 38, 49, 39, 50, 60, 70, 72, 64, 56, 58, 47, 67, 63};

    // Метод main - запускает приложение, принимая имя пользователя как аргумент
    public static void main(String[] args) {
        new BeatBoxRefactor().startUp(args[0]);
    }

    // Инициализирует соединение с сервером и настраивает MIDI перед построением GUI
    public void startUp(String name) {
        userName = name;

        // Открываем соединение с сервером
        try {
            Socket sock = new Socket("127.0.0.1", 4242);
            out = new ObjectOutputStream(sock.getOutputStream());
            in = new ObjectInputStream(sock.getInputStream());
            Thread remote = new Thread(new RemoteReader());
            remote.start();
        } catch (Exception ex){
            System.out.println("Соединение отсутствует, вам придется писать песни одному.");
        }
        setUpMidi();
        buildGUI();
    }

    /*
    * Оригинальный
    * Метод для построения графического пользовательского интерфейса
    */
    public void buildGUI() {
        theFrame = new JFrame("Cyber BeatBox"); // Создание главного окна приложения с заголовком "Cyber BeatBox"
        BorderLayout layout = new BorderLayout();    // Создание менеджера компоновки BorderLayout
        JPanel background = new JPanel(layout);      // Создание панели для размещения элементов интерфейса с помощью BorderLayout
        background.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));  // Установка отступов внутри панели
        checkboxList = new ArrayList<JCheckBox>();  // Создание списка флажков с использованием ArrayList
        Box buttonBox = new Box(BoxLayout.Y_AXIS);  // Создание вертикальной группы кнопок управления с помощью BoxLayout

        // Добавление кнопок управления и их обработчиков событий на панель buttonBox
        addButton("Start", new MyStartListener(), buttonBox);
        addButton("Stop", new MyStopListener(), buttonBox);
        addButton("Tempo up", new MyUpTempoListener(), buttonBox);
        addButton("Tempo down", new MyDownTempoListener(), buttonBox);
        addButton("Save", new MySaveListener(), buttonBox);
        addButton("Load", new MyLoadListener(), buttonBox);
        addButton("Send it", new MySendListener(), buttonBox);

        userMessage = new JTextField();                                         // Создание текстового поля для ввода сообщений пользователя
        buttonBox.add(userMessage);                                             // Добавление текстового поля на панель buttonBox
        incomingList = new JList();                                             // Создание списка для отображения входящих сообщений
        incomingList.addListSelectionListener(new MyListSelectionListener());   // Добавление слушателя выбора элемента списка
        incomingList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);     // Установка режима выбора элементов списка
        JScrollPane theList = new JScrollPane(incomingList);                    // Создание панели прокрутки для списка
        buttonBox.add(theList);                                                 // Добавление списка на панель buttonBox
        incomingList.setListData(listVector);                                   // Установка данных списка

        Box nameBox = new Box(BoxLayout.Y_AXIS);                    // Создание вертикальной панели для названий инструментов и флажков
        for (int i = 0; i < 16; i++) {
            nameBox.add(new Label(instrumentNames[i]));             // Добавление названий инструментов на панель nameBox
        }
        background.add(BorderLayout.EAST, buttonBox);               // Добавление панели с кнопками на восточную (правую) сторону фона
        background.add(BorderLayout.WEST, nameBox);                 // Добавление панели с названиями инструментов на западную (левую) сторону фона
        theFrame.getContentPane().add(background);                  // Добавление фона на контентное окно главного окна
        GridLayout grid = new GridLayout(16, 16);        // Создание сетки для размещения флажков
        grid.setVgap(1);                                            // Установка вертикального отступа между флажками
        grid.setHgap(2);                                            // Установка горизонтального отступа между флажками
        mainPanel = new JPanel(grid);                               // Создание панели для размещения флажков с использованием GridLayout
        background.add(BorderLayout.CENTER, mainPanel);             // Добавление панели с флажками в центральную часть фона

        for (int i = 0; i < 256; i++) {                             // Создание и добавление флажков на панель mainPanel
            JCheckBox c = new JCheckBox();                          // Создание флажка
            c.setSelected(false);                                   // Установка начального состояния флажка (неотмеченный)
            checkboxList.add(c);                                    // Добавление флажка в список checkboxList
            mainPanel.add(c);                                       // Добавление флажка на панель mainPanel
        }
        theFrame.setBounds(50, 50, 300, 300);   // Установка размеров и позиции главного окна
        theFrame.pack();                                            // Автоматическое определение размера окна
        theFrame.setVisible(true);                                  // Установка видимости главного окна
    }


// Создает графический интерфейс приложения
//    public void buildGUI() {
//        theFrame = new JFrame("Cyber BeatBox"); // Создаем главное окно приложения
//        BorderLayout layout = new BorderLayout();
//        JPanel background = new JPanel(layout);
//        background.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
//
//        checkboxList = new ArrayList<JCheckBox>();  // Создаем список флажков
//
//        JPanel buttonPanel = new JPanel();  // Панель для кнопок управления
//        buttonPanel.setLayout(new GridLayout(4, 1, 5, 5)); // Устанавливаем компоновщик сетки для кнопок
//
//        addButton("Start", new MyStartListener(), buttonPanel);
//        addButton("Stop", new MyStopListener(), buttonPanel);
//        addButton("Tempo up", new MyUpTempoListener(), buttonPanel);
//        addButton("Tempo down", new MyDownTempoListener(), buttonPanel);
//        addButton("Save", new MySaveListener(), buttonPanel);
//        addButton("Load", new MyLoadListener(), buttonPanel);
//
//        background.add(BorderLayout.WEST, buttonPanel);   // Добавляем панель кнопок на западную сторону
//
//        userMessage = new JTextField();
//        background.add(BorderLayout.CENTER, userMessage); // Добавляем текстовое поле в центральную область
//
//        JButton sendButton = new JButton("Send it");
//        sendButton.addActionListener(new MySendListener());
//        JPanel sendPanel = new JPanel(new BorderLayout());
//        sendPanel.add(sendButton, BorderLayout.WEST);
//        background.add(BorderLayout.EAST, sendPanel); // Добавляем кнопку "Send it" в правую часть
//
//        incomingList = new JList();
//        incomingList.addListSelectionListener(new MyListSelectionListener());
//        incomingList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//        JScrollPane theList = new JScrollPane(incomingList);
//        background.add(BorderLayout.SOUTH, theList);  // Добавляем список на южную сторону
//
//        mainPanel = new JPanel(new GridLayout(16, 16)); // Панель для флажков
//        background.add(BorderLayout.NORTH, mainPanel); // Добавляем панель флажков в верхнюю область
//
//        for (int i = 0; i < 256; i++) {     // Создаем флажки и добавляем их на панель
//            JCheckBox c = new JCheckBox();
//            c.setSelected(false);
//            checkboxList.add(c);
//            mainPanel.add(c);
//        }
//
//        // Устанавливаем высоту кнопок под размер шрифта
//        Dimension buttonSize = new Dimension(100, 30); // Выберите желаемые размеры
//        Component[] buttons = buttonPanel.getComponents();
//        for (Component button : buttons) {
//            if (button instanceof JButton) {
//                button.setPreferredSize(buttonSize);
//            }
//        }
//
//        theFrame.getContentPane().add(background);  // Добавляем все на главное окно
//        theFrame.setBounds(50, 50, 300, 300);   // Устанавливаем параметры главного окна и делаем его видимым
//        theFrame.pack();
//        theFrame.setVisible(true);  // Делаем видимым главное окно
//    }


    public void addButton(String label, ActionListener listener, Container c) {
        JButton button = new JButton(label);
        button.addActionListener(listener);
        c.add(button);
    }

    // Настраивает объекты Sequencer и Sequence для воспроизведения MIDI
    public void setUpMidi() {
        try {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequence = new Sequence(Sequence.PPQ, 4);
            track = sequence.createTrack();
            sequencer.setTempoInBPM(120);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Строит трек и запускает воспроизведение музыки
    public void buildTrackAndStart() {
        ArrayList<Integer> trackList = null;
        sequence.deleteTrack(track);
        track = sequence.createTrack();

        for (int i = 0; i < 16; i++) {
            trackList = new ArrayList<Integer>();

            for (int j = 0; j < 16; j++) {
                JCheckBox jc = (JCheckBox) checkboxList.get(j + (16 * i));
                if (jc.isSelected()){
                    int key = instruments[i];
                    trackList.add(key);
                } else {
                    trackList.add(null);
                }
            }
            makeTracks(trackList);
        }
        track.add(makeEvent(192, 9, 1, 0, 15));
        try {
            sequencer.setSequence(sequence);
            sequencer.setLoopCount(sequencer.LOOP_CONTINUOUSLY);
            sequencer.start();
            sequencer.setTempoInBPM(120);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Обработчик событий кнопки "Start"
    public class MyStartListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            buildTrackAndStart();
        }
    }

    // Обработчик событий кнопки "Stop"
    public class MyStopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            sequencer.stop();
        }
    }

    // Обработчик событий кнопки "Up Tempo"
    public class MyUpTempoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            float tempoFactor = sequencer.getTempoFactor();
            sequencer.setTempoFactor((float) (tempoFactor * 1.03));
        }
    }

    // Обработчик событий кнопки "Down Tempo"
    public class MyDownTempoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            float tempoFactor = sequencer.getTempoFactor();
            sequencer.setTempoFactor((float) (tempoFactor * .97));
        }
    }

    // Обработчик событий кнопки "Save"
    public class MySaveListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int result = fileChooser.showSaveDialog(theFrame);

            if (result ==JFileChooser.APPROVE_OPTION) {
                File selectedDirectory = fileChooser.getSelectedFile();
                File file = new File(selectedDirectory, "composition.ser");

                // Создаем массив, в котором будет храниться только состояние флажков
                boolean[] checkboxState = new boolean[256];
                for (int i = 0; i < 256; i++) {
                    JCheckBox check = (JCheckBox) checkboxList.get(i);
                    checkboxState[i] = check.isSelected();
                }
                // Сохраняем состояние флажков в файл
                CompositionSaver.saveComposition(checkboxState, file.getAbsolutePath());
            }
        }
    }

    // Обработчик событий кнопки "Load"
    public class MyLoadListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            boolean[] loadedState = CompositionSaver.loadComposition("composition.ser");    // Загружаем состояние флажков из файла

            if (loadedState != null) {  // Устанавливаем состояние флажков
                for (int i = 0; i < 256; i++) {
                    checkboxList.get(i).setSelected(loadedState[i]);
                }
                buildTrackAndStart();
            }
        }
    }

    // Обработчик событий кнопки "SendIt"
    public class MySendListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            // Создаем массив, в котором будет храниться только состояние флажков
            boolean[] checkboxState = new boolean[256];

            String messageToSend = userName + nextNum + ":" + userMessage.getText();

            try {
                out.writeObject(messageToSend);
            } catch (Exception ex) {
                System.out.println("Извините, невозможно отправить сообщение на сервер.");
                ex.printStackTrace();
            }

            for (int i = 0; i < 256; i++) {
                JCheckBox check = (JCheckBox) checkboxList.get(i);
                if (check.isSelected()) {
                    checkboxState[i] = true;
                }
            }
            CompositionSaver.saveComposition(checkboxState, "composition.ser");
            userMessage.setText("");
        }
    }


    public class RemoteReader implements Runnable {
        boolean[] checkboxState = null;
        String nameToShow = null;
        Object obj = null;

        @Override
        public void run() {
            try {
                while ((obj = in.readObject()) != null) {
                    System.out.println("Получен объект от сервера.");
                    System.out.println(obj.getClass());
                    nameToShow = (String) obj;
                    checkboxState = (boolean[]) in.readObject();
                    otherSeqsMap.put(nameToShow, checkboxState);
                    listVector.add(nameToShow);
                    incomingList.setListData(listVector);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public class MyPlayMineListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (mySequence != null) {
                sequence = mySequence;
            }
        }
    }

    public void changeSequence(boolean[] checkboxState) {
        for (int i = 0; i < 256; i++) {
            JCheckBox check = (JCheckBox) checkboxList.get(i);
            if (checkboxState[i]){
                check.setSelected(true);
            } else {
                check.setSelected(false);
            }
        }
    }
    public void makeTracks(ArrayList<Integer> list) {
        Iterator<Integer> it = list.iterator();
        for (int i = 0; i < 16; i++) {
            Integer num = (Integer) it.next();
            if (num != null) {
                int numKey = num.intValue();
                track.add(makeEvent(144, 9, numKey, 100, i));
                track.add(makeEvent(128, 9, numKey, 100, i + 1));
            }
        }
    }
    public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;

        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return event;
    }

    private class MyListSelectionListener implements javax.swing.event.ListSelectionListener {
        @Override
        public void valueChanged(ListSelectionEvent le) {
            if (!le.getValueIsAdjusting()) {
                String selected = (String) incomingList.getSelectedValue();
                if (selected != null) {
                    // Переходим к отображению и изменяем последовательность
                    boolean [] selectedState = (boolean[]) otherSeqsMap.get(selected);
                    changeSequence(selectedState);
                    sequencer.stop();
                    buildTrackAndStart();
                }
            }
        }
    }
}