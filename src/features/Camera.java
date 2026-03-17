package features;

public class Camera extends Feature {

    public Camera(String name) {
        super(name);
    }

    @Override
    public void open() {
        System.out.println("\n[System] ⌛ Opening " + getName() + "...");
        System.out.println("[" + getName() + "] 📸 Viewfinder ready.");
    }

    public void takePhoto() {
        System.out.println("[" + getName() + "] 📸 *Click* Photo saved to gallery.");
    }
}