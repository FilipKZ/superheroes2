public class SuperHero extends AbstractHero {
    public SuperHero(String name, HeroStatistics stats, TeamType type) {
        super(name, stats, type);
    }

    public SuperHero(String stringParameters) {
        super(stringParameters);
    }

    public int getPower() {
        int attack = this.getStats().getAttack();
        int defense = this.getStats().getDefense();
        int health = this.getStats().getHealth();
        return (defense + attack) * health;
    }


}
