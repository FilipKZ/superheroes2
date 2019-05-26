public class HeroStatistics {
    private int attack;
    private int health;
    private int defense;

    public HeroStatistics(int attack, int health, int defense) {
        this.attack = attack;
        this.health = health;
        this.defense = defense;
    }

    public void increaseHealth (int amount) {
        this.health += amount;
    }

    public void increaseAttack (int amount) {
        this.attack += amount;
    }

    public void increaseDefense (int amount) {
        this.defense += amount;
    }

    public int getAttack() {
        return attack;
    }

    public int getHealth() {
        return health;
    }

    public int getDefense() {
        return defense;
    }
}
