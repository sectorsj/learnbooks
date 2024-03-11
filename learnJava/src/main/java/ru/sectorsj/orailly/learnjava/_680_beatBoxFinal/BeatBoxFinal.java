package ru.sectorsj.orailly.learnjava._680_beatBoxFinal;

import javax.sound.midi.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.io.*;
import java.net.Socket;

// Класс BeatBoxFinal отвечает за основную логику приложения
public class BeatBoxFinal {

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
        new BeatBoxFinal().startUp(args[0]);
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

    // Создает графический интерфейс приложения
    public void buildGUI() {
        theFrame = new JFrame("Cyber BeatBox"); // Создаем главное окно приложения
        BorderLayout layout = new BorderLayout();
        JPanel background = new JPanel(layout);
        background.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        checkboxList = new ArrayList<JCheckBox>();  // Создаем список флажков

        Box buttonBox = new Box(BoxLayout.Y_AXIS);  // Создаем группу кнопок управления

        JButton start = new JButton("Start");
        start.addActionListener(new MyStartListener());
        buttonBox.add(start);

        JButton stop = new JButton("Stop");
        stop.addActionListener(new MyStopListener());
        buttonBox.add(stop);

        JButton upTempo = new JButton("Tempo up");
        upTempo.addActionListener(new MyUpTempoListener());
        buttonBox.add(upTempo);

        JButton downTempo = new JButton("Tempo down");
        downTempo.addActionListener(new MyDownTempoListener());
        buttonBox.add(downTempo);

        JButton sendIt = new JButton("Send it");
        sendIt.addActionListener(new MySendListener());
        buttonBox.add(sendIt);

        userMessage = new JTextField();
        buttonBox.add(userMessage);

        incomingList = new JList();
        incomingList.addListSelectionListener(new MyListSelectionListener());
        incomingList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane theList = new JScrollPane(incomingList);
        buttonBox.add(theList);
        incomingList.setListData(listVector);

        Box nameBox = new Box(BoxLayout.Y_AXIS);    // Создаем панели для названий инструментов и для флажков
        for (int i = 0; i < 16; i++) {
            nameBox.add(new Label(instrumentNames[i]));
        }
        background.add(BorderLayout.EAST, buttonBox);   // Добавляем элементы на панели
        background.add(BorderLayout.WEST, nameBox);

        theFrame.getContentPane().add(background);  // Добавляем панели в главное окно
        GridLayout grid = new GridLayout(16, 16);
        grid.setVgap(1);
        grid.setHgap(2);
        mainPanel = new JPanel(grid);
        background.add(BorderLayout.CENTER, mainPanel);

        for (int i = 0; i < 256; i++) {     // Создаем флажки и добавляем их на панель
            JCheckBox c = new JCheckBox();
            c.setSelected(false);
            checkboxList.add(c);
            mainPanel.add(c);
        }
        theFrame.setBounds(50, 50, 300, 300);   // Устанавливаем параметры главного окна и делаем его видимым
        theFrame.pack();
        theFrame.setVisible(true);  // Делаем видимым главное окно
    }

    // Настраивает объекты Sequencer и Sequence для воспроизведения MIDI
    private void setUpMidi() {
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
                    trackList.add(Integer.valueOf(key));
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

    // Обработчик событий кнопки "SendIt"
    public class MySendListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            // Создаем массив, в котором будет храниться только состояние флажков
            boolean[] checkboxState = new boolean[256];

            for (int i = 0; i < 256; i++) {
                JCheckBox check = (JCheckBox) checkboxList.get(i);
                if (check.isSelected()) {
                    checkboxState[i] = true;
                }
                String messageToSend = null;
                try {
                    out.writeObject(userName + nextNum + ":" + userMessage.getText());
                    out.writeObject(checkboxState);
                } catch (Exception ex) {
                    System.out.println("Извините, невозможно отправить сообщение на сервер.");
                    ex.printStackTrace();
                }
                userMessage.setText("");
            }
        }
    }

    public class MyListSelectionListener implements javax.swing.event.ListSelectionListener {
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
}