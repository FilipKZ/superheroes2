import java.util.ArrayList;
import java.util.List;

public class Team {
    private TeamType type;
    private List<AbstractHero> heroes;
    private AbstractHero teamLeader;
    private Side side = Side.UNKNOWN;
    private boolean buffedUsed = false;

    public Team(TeamType type) {
        this.type = type;
        this.heroes = new ArrayList<AbstractHero>();
        this.teamLeader = getTeamLeader();
    }

    public boolean addHeroToTeam (AbstractHero hero) throws InvalidHeroTeamException {
        if (hero.getType().equals(this.type)) {
            this.heroes.add(hero);
            this.setSide();
            return true;
        } throw new InvalidHeroTeamException("Invalid hero exception");
    }

    public AbstractHero getTeamLeader() {

        for (AbstractHero hero : this.heroes) {
            if (hero.getPower() > teamLeader.getPower()) {
                this.teamLeader = hero;
            }
        }
        return teamLeader;
    }

    public int getTeamPower () {
        int power = 0;
        for (AbstractHero hero : this.heroes) {
            power += hero.getPower();
        }
        return power;
    }

    public void buffTeamPower () {
        if (buffedUsed) return;
        for (AbstractHero hero : this.heroes) {
            if (hero instanceof Villain) {
                hero.getStats().increaseHealth(10);
            } else if (hero instanceof SuperHero) {
                hero.getStats().increaseDefense(10);
            }
        }
        buffedUsed = true;
    }

    private void setSide () {
        int goodies = 0;
        int badies = 0;
        for (AbstractHero hero : this.heroes) {
            if (hero instanceof Villain) {
                badies++;
            } else if (hero instanceof SuperHero) {
                goodies++;
            }
        }
        if (goodies > badies) {
            this.side = Side.GOOD;
        } else if (badies > goodies) {
            this.side = Side.EVIL;
        } else this.side = Side.UNKNOWN;
    }

    private void setSideByPower () {
        int goodies = 0;
        int badies = 0;
        for (AbstractHero hero : this.heroes) {
            if (hero instanceof Villain) {
                badies += hero.getPower();
            } else if (hero instanceof SuperHero) {
                goodies += hero.getPower();
            }
        }
        if (goodies > badies) {
            this.side = Side.GOOD;
        } else if (badies > goodies) {
            this.side = Side.EVIL;
        } else this.side = Side.UNKNOWN;
    }

    public TeamType getType() {
        return type;
    }

    public List<AbstractHero> getHeroes() {
        return heroes;
    }

    public Side getSide() {
        return side;
    }
}
