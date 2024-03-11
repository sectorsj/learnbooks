package ru.sectorsj.orailly.learnjava._372_miniMiniMusicApp;

import javax.sound.midi.*;

public class MiniMiniMusicApp {
    public static void main(String[] args) {
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();
    }

    public void play() {
        try {
            // 1. Получаем синтезатор и открываем его
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            // 2. Создаем новыю последовательность
            // *последовательность - это CD с единственным треком
            Sequence seq = new Sequence(Sequence.PPQ, 4);

            // 3. Получаем новый трек из последовательности
            Track track = seq.createTrack();

            // 4.1 Заполняем трек MIDI-событиями
            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 20, 100);
            // Нота начинает играть - noteOn
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, 20, 100);
            // Нота перестает играть - noteOff
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);

            // 4.2 Передаем MIDI-события в созданный синтезатор
            player.setSequence(seq);

            // 5. Запускаем синтезатор,
            // типо нажимаем кнопку "Играть"
            player.start();

        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}