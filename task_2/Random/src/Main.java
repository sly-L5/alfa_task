import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int age = random.nextInt(101);
        double money = random.nextDouble(500_000);
        boolean blackList = false;
        boolean invitation = true;
        double vznos = money * 0.075;

        if (age >= 18 && (money >= 50_000 || invitation) && !blackList) {
            System.out.println("Добро пожаловать!");
        } else {
            System.out.println("Вы не подходите(");
        }

        System.out.println("Возраст: " + age);
        System.out.println("Деньги: " + money);
        System.out.println("Добровольный взнос: " + vznos);
    }
}
