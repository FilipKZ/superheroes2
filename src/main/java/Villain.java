public class Villain extends AbstractHero {
    public Villain(String name, HeroStatistics stats, TeamType type) {
        super(name, stats, type);
    }

    public Villain(String stringParameters) {
        super(stringParameters);
    }

    public int getPower() {
        int attack = this.getStats().getAttack();
        int defense = this.getStats().getDefense();
        int health = this.getStats().getHealth();
        return (health + attack) * defense;
    }
}
