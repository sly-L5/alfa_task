package arena.heroes;

public class Knight extends Hero {
    private int armor;

    public Knight(String name, int armor) {
        super(name);
        this.armor = armor;
    }

    @Override
    public void attack() {
        System.out.println("Рыцарь бьёт мечом!");
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    // ===== ПОПЫТКА ПЕРЕОПРЕДЕЛИТЬ rest() - ЗАКОММЕНТИРОВАНА =====
    // @Override
    // public void rest() {
    //     System.out.println("Рыцарь отдыхает..."); // Ошибка компиляции!
    // }

    @Override
    public String toString() {
        return "Knight{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", health=" + health +
                ", armor=" + armor +
                '}';
    }
}