package ru.sectorsj.orailly.learnjava._376_miniMusicCmdLine;

import javax.sound.midi.*;

public class MiniMusicCmdLine {
    public static void main(String[] args) {
        MiniMusicCmdLine mini = new MiniMusicCmdLine();
        if (args.length < 2){
            System.out.println("Не забудьте аргументы для инструмента и ноты");
        } else {
            int instrument = Integer.parseInt(args[0]);
            int note = Integer.parseInt(args[1]);
            mini.play(instrument, note);
        }
    }

    public void play(int instrument, int note) {
        try {
            // 1. Получаем синтезатор и открываем его
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            // 2. Создаем новыю последовательность
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            // 3. Получаем новый трек из последовательности
            Track track = seq.createTrack();

            MidiEvent event = null;

            // 4. Заполняем трек MIDI-событиями
            // 4.1 Меняем инструмент
            ShortMessage first = new ShortMessage();
            first.setMessage(192, 1, instrument, 0);
            MidiEvent changeInstrument = new MidiEvent(first, 1);
            track.add(changeInstrument);

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, note, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, note, 100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);

            // 4.2 Передаем MIDI-события в созданный синтезатор
            player.setSequence(seq);
            // 5. Запускаем синтезатор,
            player.start();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}