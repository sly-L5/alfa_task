package arena.heroes;

public class Archer extends Hero {
    private int arrowsCount;

    public Archer(String name, int arrowsCount) {
        super(name);
        this.arrowsCount = arrowsCount;
    }

    @Override
    public void attack() {
        System.out.println("Лучник выпускает стрелу!");
    }

    public int getArrowsCount() {
        return arrowsCount;
    }

    public void setArrowsCount(int arrowsCount) {
        this.arrowsCount = arrowsCount;
    }

    @Override
    public String toString() {
        return "Archer{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", health=" + health +
                ", arrowsCount=" + arrowsCount +
                '}';
    }
}