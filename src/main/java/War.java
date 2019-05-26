import java.util.Random;

public class War {

    public String battle (Team teamOne, Team teamTwo) throws InterruptedException {
        String result;
        while (!teamOne.getHeroes().isEmpty() && !teamTwo.getHeroes().isEmpty()) {
            AbstractHero hero1 = teamOne.getHeroes().get(new Random().nextInt(teamOne.getHeroes().size()));
            AbstractHero hero2 = teamTwo.getHeroes().get(new Random().nextInt(teamTwo.getHeroes().size()));
            System.out.println(hero1 + " (Team 1) " + " -vs- " + hero2 + " (Team2) ");
            Thread.sleep(2000);
            if (hero1.getPower() > hero2.getPower()) {
                teamTwo.getHeroes().remove(hero2);
                System.out.println("Wygrał " + hero1 + " (Team 1)");
                System.out.println();
                Thread.sleep(1000);
            } else {
                teamOne.getHeroes().remove(hero1);
                System.out.println("Wygrał " + hero2 + " (Team 2)");
                System.out.println();
                Thread.sleep(1000);
            }
        }
        if (teamOne.getHeroes().isEmpty()) {
            result = "Wygrała drużyna 2";
        } else {
            result = "Wygrała drużyna 1";
        }
        return result;
    }

}
