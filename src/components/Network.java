package components;

public class Network {
    private boolean dataOn;

    public Network() {
        this.dataOn = false;
    }

    public boolean isDataOn() {
        return dataOn;
    }

    public void toggleData() {
        dataOn = !dataOn;
        String status = dataOn ? "ON" : "OFF";
        System.out.println("[Network] 📶 Mobile Data turned: " + status);
    }

    public void connect() {
        if (dataOn) {
            System.out.println("[Network] 📶 Connected to 5G signal.");
        } else {
            System.out.println("[Network] ✈️  No connection. Please turn on Data.");
        }
    }
}