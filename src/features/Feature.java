package features;

public class Feature {
    private String name;

    public Feature(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // open() is overrideable so subclasses can show custom opening messages
    public void open() {
        System.out.println("\n[System] ⌛ Opening " + name + "...");
    }
}