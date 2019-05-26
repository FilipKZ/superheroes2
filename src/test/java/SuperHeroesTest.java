import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;

public class SuperHeroesTest {
    @Test
    public void increaseStatsRedVillain () {
        AbstractHero villain = new Villain("aiu", new HeroStatistics(50, 50, 50), TeamType.RED);
        Assert.assertEquals(100, villain.getStats().getHealth());
    }

    @Test
    public void increaseStatsBlueVillain () {
        AbstractHero villain = new Villain("aiu", new HeroStatistics(50, 50, 50), TeamType.BLUE);
        Assert.assertEquals(100, villain.getStats().getAttack());
    }

    @Test
    public void increaseStatsGreenVillain () {
        AbstractHero villain = new Villain("aiu", new HeroStatistics(50, 50, 50), TeamType.GREEN);
        Assert.assertEquals(100, villain.getStats().getDefense());
    }

    @Test
    public void increaseStatsRedSuperHero () {
        AbstractHero hero = new SuperHero("aiu", new HeroStatistics(50, 50, 50), TeamType.RED);
        Assert.assertEquals(100, hero.getStats().getHealth());
    }

    @Test
    public void increaseStatsBlueSuperHero () {
        AbstractHero hero = new SuperHero("aiu", new HeroStatistics(50, 50, 50), TeamType.BLUE);
        Assert.assertEquals(100, hero.getStats().getAttack());
    }

    @Test
    public void increaseStatsGreenSuperHero () {
        AbstractHero hero = new SuperHero("aiu", new HeroStatistics(50, 50, 50), TeamType.GREEN);
        Assert.assertEquals(100, hero.getStats().getDefense());
    }
    @Test
    public void increaseStatsDefaultRedVillain () throws FileNotFoundException {
        HeroCreator creator = new HeroCreator();
        AbstractHero villain = creator.createVillainWithDefaultStats("ihasdiu", TeamType.RED);

        Assert.assertEquals(100, villain.getStats().getHealth());
    }

    @Test
    public void increaseStatsDefaultBlueHero () throws FileNotFoundException {
        HeroCreator creator = new HeroCreator();
        AbstractHero hero = creator.createSuperHeroWithDefaultStats("ihasdiu", TeamType.BLUE);

        Assert.assertEquals(100, hero.getStats().getAttack());
    }
}
