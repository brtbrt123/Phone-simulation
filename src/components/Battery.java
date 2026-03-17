package components;

public class Battery {
    private int level;

    public Battery() {
        this.level = 100;
    }

    public int getLevel() {
        return level;
    }

    public boolean isDead() {
        return level <= 0;
    }

    public void use(int amount) {
        level -= amount;
        if (level < 0) level = 0;
        System.out.println("[Battery] ⚡ Power used: -" + amount + "%. Remaining: " + level + "%");

        if (level <= 20 && level > 0) {
            System.out.println("[Battery] ⚠️  Low battery warning!");
        }
    }
}