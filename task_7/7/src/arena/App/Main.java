package arena.App;

import arena.heroes.*;

public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Knight("Артур", 50),
                new Archer("Леголас", 30),
                new Mage("Гэндальф", 200)
        };

        System.out.println("========== ПОЛИМОРФИЗМ ==========");
        for (Hero hero : heroes) {
            hero.printInfo();
            hero.attack();
            System.out.println();
        }

        System.out.println("========== СТАТИСТИКА ==========");
        Hero.printHeroesCreated();
        System.out.println("Максимальный уровень героев: " + Hero.MAX_LEVEL);

        System.out.println("\n========== FINAL ПЕРЕМЕННАЯ ==========");
        final Knight knight = new Knight("Ланселот", 80);

        System.out.println("До изменения:");
        System.out.println(knight);

        knight.setArmor(95);

        System.out.println("После изменения:");
        System.out.println(knight);

        System.out.println("\n========== ТЕСТИРОВАНИЕ МЕТОДОВ ==========");
        Hero testHero = new Hero("Тестовый герой");
        testHero.printInfo();
        testHero.levelUp();
        testHero.takeDamage(30);
        testHero.takeDamage(80); // должно стать 0
        testHero.attack("Орк");
        testHero.attack("Дракон", 5);
        testHero.rest();
    }
}