package Glava_13;
import javax.sound.midi.*;
public class MusicTest1 {
    public void play() {
        try {
            Sequence sequencer = MidiSystem.getSequencer().getSequence();
            System.out.println("Суквенсор успешно установлен");
        } catch (MidiUnavailableException e) {
            System.out.println("Облом");
        }
    }
    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }
}
