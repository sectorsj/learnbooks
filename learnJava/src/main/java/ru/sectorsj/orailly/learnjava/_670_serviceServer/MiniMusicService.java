package ru.sectorsj.orailly.learnjava._670_serviceServer;

import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MiniMusicService implements Service {
    MyDrawPanel myPanel;

    // Метод для получения графической панели
    @Override
    public JPanel getGuiPanel() {
        JPanel mainPanel = new JPanel();                         // Создание основной панели
        myPanel = new MyDrawPanel();                             // Создание панели для рисования
        JButton playItButton = new JButton("Play it");      // Создание кнопки "Play it"
        playItButton.addActionListener(new PlayItListener());    // Добавление слушателя событий для кнопки
        mainPanel.add(myPanel);                                  // Добавление панели для рисования на основную панель
        mainPanel.add(playItButton);                             // Добавление кнопки на основную панель
        return mainPanel;                                        // Возвращение основной панели
    }

    // Внутренний класс для обработки событий кнопки
    public class PlayItListener implements ActionListener {

        // Метод, вызываемый при нажатии на кнопку
        @Override
        public void actionPerformed(ActionEvent e) {

            try {
                Sequencer sequencer = MidiSystem.getSequencer();    // Получение объекта Sequencer
                sequencer.open();   // Открытие Sequencer

                sequencer.addControllerEventListener(myPanel, new int[] {127}); // Добавление слушателя к Sequencer
                Sequence seq = new Sequence(Sequence.PPQ, 4);   // Создание последовательности
                Track track = seq.createTrack();    // Создание трека

                // Генерация случайных событий
                for (int i = 0; i < 100; i+= 4) {
                    int rNum = (int) ((Math.random() * 50) + 1);    // Генерация случайного числа
                    if (rNum < 38) {    // Проверка условия
                        track.add(makeEvent(144, 1, rNum, 100, i));          // Добавление события Note On в трек
                        track.add(makeEvent(176, 1, 127, 0, i));        // Добавление события Controller Event в трек
                        track.add(makeEvent(128, 1, rNum, 100, i + 2)); // Добавление события Note Off в трек
                    }
                }
                sequencer.setSequence(seq);     // Установка последовательности для Sequencer
                sequencer.start();              // Запуск воспроизведения
                sequencer.setTempoInBPM(220);   // Установка темпа

            } catch (Exception ex) {            // Обработка исключений
                ex.printStackTrace();           // Вывод трассировки стека
            }
        }
    }

    // Метод для создания MIDI-события
    public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick){
        MidiEvent event = null;

        try {
            ShortMessage a = new ShortMessage();    // Создание ShortMessage
            a.setMessage(comd, chan, one, two);     // Установка параметров сообщения
            event = new MidiEvent(a, tick);         // Создание MIDI-события
        } catch (Exception ex){                     // Обработка исключений
            ex.printStackTrace();                   // Вывод трассировки стека
        }
        return event;                               // Возвращение события
    }

    // Внутренний класс для отрисовки графической панели и обработки MIDI-событий
    class MyDrawPanel extends JPanel implements ControllerEventListener {
        // Флаг для рисования только тогда, когда наступит определенное событие
        boolean msg = false;

        // Метод для обработки MIDI-событий
        @Override
        public void controlChange(ShortMessage event) {
            msg = true; // Установка флага
            repaint();  // Перерисовка компонента
        }

        // Метод для определения предпочтительного размера панели
        public Dimension getPreferredSize(){
            return new Dimension(300, 300); // Установка размера панели
        }

        // Метод для отрисовки компонента
        public void paintComponent(Graphics g){
            if (msg) {  // Если есть событие
                Graphics2D g2 = (Graphics2D) g;             // Приведение Graphics к Graphics2D
                int red = (int) (Math.random() * 250);      // Генерация случайного значения для красного цвета
                int green = (int) (Math.random() * 250);    // Генерация случайного значения для зеленого цвета
                int blue = (int) (Math.random() * 250);     // Генерация случайного значения для синего цвета

                g.setColor(new Color(red, green, blue));    // Установка цвета

                // Генерация случайных параметров для прямоугольника
                int height = (int) ((Math.random() * 120) + 10);
                int width = (int) ((Math.random() * 120) + 10);
                int x = (int) ((Math.random() * 40) + 10);
                int y = (int) ((Math.random() * 40) + 10);

                g.fillRect(x, y, height, width);    // Отрисовка прямоугольника
                msg = false;                        // Сброс флага
            }
        }
    }
}