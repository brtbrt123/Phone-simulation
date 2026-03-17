package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Smartphone nokia = new Smartphone();
        nokia.bootUp();

        boolean power = true;

        while (power && !nokia.getBattery().isDead()) {
            nokia.showScreen();

            String key = sc.next();
            sc.nextLine(); // clear buffer

            switch (key) {
                case "1":
                    nokia.getViber().open();
                    System.out.print("  Write Msg: ");
                    String text = sc.nextLine();
                    if (nokia.getNetwork().isDataOn()) {
                        nokia.getViber().send(text);
                        nokia.getBattery().use(5);
                    } else {
                        System.out.println("  ! No Data Signal. Please turn on Data first!");
                    }
                    break;

                case "2":
                    nokia.getDialer().open();
                    nokia.getDialer().call("0912-PNC-3310");
                    nokia.getBattery().use(8);
                    break;

                case "3":
                    nokia.getCam().open();
                    nokia.getCam().takePhoto();
                    nokia.getBattery().use(12);
                    break;

                case "4":
                    nokia.getMusic().open();
                    nokia.getMusic().play("Nokia Tune Remix");
                    nokia.getBattery().use(6);
                    break;

                case "5":
                    nokia.getWeb().open();
                    if (nokia.getNetwork().isDataOn()) {
                        nokia.getWeb().surf("wap.pnc.edu.ph");
                        nokia.getBattery().use(10);
                    } else {
                        System.out.println("  ! Connect Data first!");
                    }
                    break;

                case "6":
                    nokia.getNetwork().toggleData();
                    break;

                case "0":
                    System.out.println();
                    System.out.println("  +------------------------------+");
                    System.out.println("  |                              |");
                    System.out.println("  |     Goodbye! See you soon.   |");
                    System.out.println("  |                              |");
                    System.out.println("  +------------------------------+");
                    power = false;
                    break;

                default:
                    System.out.println("  ! Invalid key. Try again.");
            }
        }

        // Battery-dead end state
        if (nokia.getBattery().isDead()) {
            System.out.println();
            System.out.println("  +------------------------------+");
            System.out.println("  |                              |");
            System.out.println("  |   Battery dead. Shutting     |");
            System.out.println("  |         down...              |");
            System.out.println("  |                              |");
            System.out.println("  +------------------------------+");
        }

        sc.close();
    }
}