package arena.heroes;

public class Hero {
    protected String name;
    protected int level;
    protected int health;

    private static int heroesCreated = 0;

    public static final int MAX_LEVEL = 100;

    public Hero(String name) {
        this.name = name;
        this.level = 1;
        this.health = 100;
        heroesCreated++; // увеличиваем счётчик при создании
    }

    public void printInfo() {
        System.out.println("========== Герой ==========");
        System.out.println("Имя: " + name);
        System.out.println("Уровень: " + level);
        System.out.println("Здоровье: " + health);
        System.out.println("============================");
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
        System.out.println(name + " получил " + damage + " урона. Осталось здоровья: " + health);
    }

    public void levelUp() {
        if (level < MAX_LEVEL) {
            level++;
            System.out.println(name + " повысил уровень до " + level);
        } else {
            System.out.println(name + " уже достиг максимального уровня (" + MAX_LEVEL + ")");
        }
    }

    public void attack() {
        System.out.println("Герой наносит обычный удар.");
    }

    public void attack(String target) {
        System.out.println("Герой наносит обычный удар. Цель: " + target);
    }

    public void attack(String target, int times) {
        System.out.println("Герой атакует цель " + target + " " + times + " раза.");
    }

    public final void rest() {
        System.out.println("Герой отдыхает и восстанавливает силы.");
    }

    public static void printHeroesCreated() {
        System.out.println("Всего создано героев: " + heroesCreated);
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", health=" + health +
                '}';
    }
}