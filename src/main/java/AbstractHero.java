public abstract class AbstractHero {
    private String name;
    private HeroStatistics stats;
    private TeamType type;

    public AbstractHero(String name, HeroStatistics stats, TeamType type) {
        this.name = name;
        this.stats = stats;
        this.type = type;

        switch (type) {
            case RED:
                this.stats.increaseHealth(50);
                break;
            case BLUE:
                this.stats.increaseAttack(50);
                break;
            case GREEN:
                this.stats.increaseDefense(50);
                break;
        }
    }

    public AbstractHero(String stringParameters) {
        String[] heroArray = stringParameters.split(";");
        this.name = heroArray[2];
        this.stats = new HeroStatistics(
                Integer.parseInt(heroArray[5]),
                Integer.parseInt(heroArray[3]),
                Integer.parseInt(heroArray[4]));
        this.type = TeamType.valueOf(heroArray[6]);
    }

    public abstract int getPower ();

    public String getName() {
        return name;
    }

    public HeroStatistics getStats() {
        return stats;
    }

    public TeamType getType() {
        return type;
    }


    public String heroToString (AbstractHero hero) {
        String heroString = "";
        heroString = heroString +
                this.getClass() + ";" +
                this.getName() + ";" +
                this.getStats().getHealth() + ";" +
                this.getStats().getDefense() + ";" +
                this.getStats().getAttack() + ";" +
                this.getType();

        return heroString;
    }

    @Override
    public String toString() {
        return name;
    }
}
