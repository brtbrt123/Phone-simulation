package features;

public class PhoneCall extends Feature {

    public PhoneCall(String name) {
        super(name);
    }

    @Override
    public void open() {
        System.out.println("\n[System] ⌛ Opening " + getName() + "...");
        System.out.println("[" + getName() + "] 📞 Dialer ready.");
    }

    public void call(String number) {
        System.out.println("[" + getName() + "] 📞 Dialing: " + number + "...");
    }
}