import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class HeroCreator {

    public AbstractHero createCustomSuperHero (String name, HeroStatistics stats, TeamType type) {
        return new SuperHero(name, stats, type);
    }

    public AbstractHero createCustomVillain (String name, HeroStatistics stats, TeamType type) {
        return new Villain(name, stats, type);
    }

    public AbstractHero createSuperHeroWithDefaultStats (String name, TeamType type) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("C:\\Users\\Admin\\ProjectsSDA\\superheroes\\src\\main\\resources\\config.txt"));
        int attack = scanner.nextInt() + new Random().nextInt(500);
        int defense = scanner.nextInt() + new Random().nextInt(500);
        int health = scanner.nextInt() + new Random().nextInt(500);
        return new SuperHero(name, new HeroStatistics(attack, health, defense), type);
    }

    public AbstractHero createVillainWithDefaultStats (String name, TeamType type) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("C:\\Users\\Admin\\ProjectsSDA\\superheroes\\src\\main\\resources\\config.txt"));
        int attack = scanner.nextInt() + new Random().nextInt(500);
        int defense = scanner.nextInt() + new Random().nextInt(500);
        int health = scanner.nextInt() + new Random().nextInt(500);
        return new Villain(name, new HeroStatistics(attack, health, defense), type);
    }

    public AbstractHero createRandomHero (String name) throws FileNotFoundException {
        int villainOrHero = new Random().nextInt(6);
        AbstractHero randomHero = null;
        switch (villainOrHero) {
            case 0:
                randomHero = createSuperHeroWithDefaultStats(name, TeamType.BLUE);
                break;
            case 1:
                randomHero = createSuperHeroWithDefaultStats(name, TeamType.RED);
                break;
            case 2:
                randomHero = createSuperHeroWithDefaultStats(name, TeamType.GREEN);
                break;
            case 3:
                randomHero = createVillainWithDefaultStats(name, TeamType.BLUE);
                break;
            case 4:
                randomHero = createVillainWithDefaultStats(name, TeamType.RED);
                break;
            case 5:
                randomHero = createVillainWithDefaultStats(name, TeamType.GREEN);
                break;
        }
        return randomHero;
    }
}
