package features;

public class Messenger extends Feature {

    public Messenger(String name) {
        super(name);
    }

    @Override
    public void open() {
        System.out.println("\n[System] ⌛ Opening " + getName() + "...");
        System.out.println("[" + getName() + "] 💬 Conversations loaded.");
    }

    public void send(String msg) {
        System.out.println("[" + getName() + "] 💬 SENT: " + msg);
    }
}