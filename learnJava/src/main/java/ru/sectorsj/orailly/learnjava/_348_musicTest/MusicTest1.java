package ru.sectorsj.orailly.learnjava._348_musicTest;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class MusicTest1 {
    public void play(){
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Успешно получен синтезатор " + sequencer);
        } catch (MidiUnavailableException ex) {
            System.out.println("Неудача " + ex);
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }
}
