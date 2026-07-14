import java.util.Random;

public class Main {
    private static final int MAX_AGE = 100;
    private static final int MIN_AGE = 18;
    private static final double MAX_MONEY = 500_000;
    private static final double MIN_MONEY = 50_000;
    private static final double CONTRIBUTION_RATE = 0.075;
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int age = RANDOM.nextInt(MAX_AGE + 1);
        double money = RANDOM.nextDouble(MAX_MONEY);
        boolean blackList = false;
        boolean invitation = true;
        double vznos = money * CONTRIBUTION_RATE;

        if (age >= MIN_AGE && (money > MIN_MONEY || invitation) && !blackList) {
            System.out.println("Добро пожаловать!");
        } else {
            System.out.println("Вы не подходите(");
        }

        System.out.println("Возраст: " + age);
        System.out.println("Деньги: " + money);
        System.out.println("Добровольный взнос: " + vznos);
    }
}
