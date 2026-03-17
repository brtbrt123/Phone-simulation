package main;

import components.Battery;
import components.Network;
import features.Browser;
import features.Camera;
import features.Messenger;
import features.MusicPlayer;
import features.PhoneCall;

public class Smartphone {

    // Composition: Battery and Network are internal hardware —
    // they are created by and exist only as part of this Smartphone.
    private Battery battery;
    private Network network;

    // Aggregation: Feature objects are apps — the phone manages them
    // but they are instantiated independently and could exist on their own.
    private Messenger viber;
    private Camera cam;
    private MusicPlayer music;
    private Browser web;
    private PhoneCall dialer;

    public Smartphone() {
        // Composition — components are built inside the phone
        this.battery = new Battery();
        this.network = new Network();

        // Aggregation — apps are loaded onto the phone
        this.viber  = new Messenger("Viber");
        this.cam    = new Camera("Camera");
        this.music  = new MusicPlayer("Music");
        this.web    = new Browser("WAP Browser");
        this.dialer = new PhoneCall("Phone");
    }

    // --- Getters (encapsulation: no direct field access from outside) ---
    public Battery getBattery() { return battery; }
    public Network getNetwork()  { return network; }
    public Messenger getViber()  { return viber; }
    public Camera getCam()       { return cam; }
    public MusicPlayer getMusic(){ return music; }
    public Browser getWeb()      { return web; }
    public PhoneCall getDialer() { return dialer; }

    // --- Phone-level methods ---
    public void bootUp() {
        System.out.println();
        System.out.println("  +------------------------------+");
        System.out.println("  |                              |");
        System.out.println("  |    ( ( (  N O K I A  ) ) )   |");
        System.out.println("  |         Connecting...        |");
        System.out.println("  |                              |");
        System.out.println("  +------------------------------+");
        network.connect();
    }

    public void showScreen() {
        // Battery level always 3 chars wide — keeps alignment stable at 100%, 20%, 5%
        String battStr  = String.format("%3d", battery.getLevel());
        String dataIcon = network.isDataOn() ? "DATA:ON " : "DATA:OFF";
        String dataKey  = network.isDataOn() ? "[6] Data: ON " : "[6] Data: OFF";

        System.out.println();
        System.out.println("  +------------------------------+");
        System.out.println("  | " + dataIcon + "        Batt: " + battStr + "% |");
        System.out.println("  |------------------------------|");
        System.out.println("  |          - READY -           |");
        System.out.println("  |------------------------------|");
        System.out.println("  |  [1] Messenger  [2] Call     |");
        System.out.println("  |  [3] Camera     [4] Music    |");
        System.out.println("  |  [5] Browser    " + String.format("%-14s", dataKey) + "|");
        System.out.println("  |------------------------------|");
        System.out.println("  |  [0] Power Off               |");
        System.out.println("  +------------------------------+");
        System.out.print(  "  | Press key: ");
    }
}