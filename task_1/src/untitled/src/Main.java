public class Main {
    public static void main(String[] args) {
        String name = "Олег";
        String post = "Старший шаурма-инженер";
        int bet = 4_500;
        int change = 5;
        int prize = 2_000;
        int fine = 200;
        int price = 400;
        int shayrma = 5_000;
        int zp = change * bet;
        int zpPrize = zp + prize;
        int revenue = shayrma * price;

        System.out.println("Леон");


        System.out.println("Сотрудник: " + name);
        System.out.println("Должность: " + post);
        System.out.println("Оплата за смены: " + zp);
        System.out.println("Премия: " + prize);
        System.out.println("Штраф: " + fine);
        System.out.println("Итоговая зарплата: " + zpPrize);
        System.out.println("Шаур-выручка: " + revenue);
    }
}