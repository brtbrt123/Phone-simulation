package features;

public class Browser extends Feature {

    public Browser(String name) {
        super(name);
    }

    @Override
    public void open() {
        System.out.println("\n[System] ⌛ Opening " + getName() + "...");
        System.out.println("[" + getName() + "] 🌐 Browser ready.");
    }

    public void surf(String url) {
        System.out.println("[" + getName() + "] 🌐 Loading: " + url);
    }
}