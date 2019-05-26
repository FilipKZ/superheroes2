import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, InvalidHeroTeamException, InterruptedException {
        HeroCreator creator = new HeroCreator();
        Team red = new Team(TeamType.RED);
        Team blue = new Team(TeamType.BLUE);
        Team green = new Team(TeamType.GREEN);

        for (int i = 0; i < 20; i++) {
            AbstractHero generatedHero = creator.createRandomHero("Hero " + i);
            switch (generatedHero.getType()) {
                case RED:
                    red.addHeroToTeam(generatedHero);
                    break;
                case BLUE:
                    blue.addHeroToTeam(generatedHero);
                    break;
                case GREEN:
                    green.addHeroToTeam(generatedHero);
                    break;
            }
        }

        War war = new War();
        System.out.println(war.battle(red, blue));

    }

}

