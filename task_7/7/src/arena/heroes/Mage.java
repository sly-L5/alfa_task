package arena.heroes;

public class Mage extends Hero {

    private int mana;
    public Mage(String name, int mana) {
        super(name);
        this.mana = mana;
    }

    @Override
    public void attack() {
        System.out.println("Маг запускает огненный шар!");
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public String toString() {
        return "Mage{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", health=" + health +
                ", mana=" + mana +
                '}';
    }
}