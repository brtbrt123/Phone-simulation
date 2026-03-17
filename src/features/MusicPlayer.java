package features;

public class MusicPlayer extends Feature {

    public MusicPlayer(String name) {
        super(name);
    }

    @Override
    public void open() {
        System.out.println("\n[System] ⌛ Opening " + getName() + "...");
        System.out.println("[" + getName() + "] 🎵 Library loaded.");
    }

    public void play(String song) {
        System.out.println("[" + getName() + "] 🎵 Now playing: " + song);
    }
}