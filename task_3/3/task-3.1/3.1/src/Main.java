public class Main {
    public static void main(String[] args) {
        String[] petyaBasket = {"курица", "бананы", "творог"};
        String[] koliaBasket = {"курица", "бананы", "творог"};
        String[] terentiiBasket = {"пиво", "пельмени", "ласка магия черного"};

        System.out.println("=== Сравнение по количеству товаров ===");

        if (petiaBasket.length == koliaBasket.length) {
            System.out.println("Количество товаров у Пети и Коли равное: " + petiaBasket.length);
        } else {
            System.out.println("Количество товаров у Пети и Коли разное");
        }

        if (petiaBasket.length == terentiiBasket.length) {
            System.out.println("Количество товаров у Пети и Терентия равное: " + petiaBasket.length);
        } else {
            System.out.println("Количество товаров у Пети и Терентия разное");
        }

        System.out.println("\n=== Сравнение по составу ===");

        boolean equal = true;
        if (petiaBasket.length != koliaBasket.length) {
            equal = false;
        } else {
            for (int i = 0; i < petiaBasket.length; i++) {
                if (!petiaBasket[i].equals(koliaBasket[i])) {
                    equal = false;
                }
            }
        }

        if (equal) {
            System.out.println("Состав корзин у Пети и Коли равный");
        } else {
            System.out.println("Состав корзин у Пети и Коли разный");
        }

        equal = true;
        if (petiaBasket.length != terentiiBasket.length) {
            equal = false;
        } else {
            for (int i = 0; i < petiaBasket.length; i++) {
                if (!petiaBasket[i].equals(terentiiBasket[i])) {
                    equal = false;
                }
            }
        }

        if (equal) {
            System.out.println("Состав корзин у Пети и Терентия равный");
        } else {
            System.out.println("Состав корзин у Пети и Терентия разный");
        }

        System.out.println("\n=== Исследование длин названий ===");

        String[] allItems = new String[petiaBasket.length + koliaBasket.length + terentiiBasket.length];
        int index = 0;

        for (int i = 0; i < petiaBasket.length; i++) {
            allItems[index] = petiaBasket[i];
            index++;
        }

        for (int i = 0; i < koliaBasket.length; i++) {
            allItems[index] = koliaBasket[i];
            index++;
        }

        for (int i = 0; i < terentiiBasket.length; i++) {
            allItems[index] = terentiiBasket[i];
            index++;
        }

        String longest = allItems[0];
        String shortest = allItems[0];
        int sum = 0;

        for (int i = 0; i < allItems.length; i++) {
            sum = sum + allItems[i].length();

            if (allItems[i].length() > longest.length()) {
                longest = allItems[i];
            }

            if (allItems[i].length() < shortest.length()) {
                shortest = allItems[i];
            }
        }

        double average = (double) sum / allItems.length;

        System.out.println("Самый длинный товар: " + longest + " (длина: " + longest.length() + ")");
        System.out.println("Самый короткий товар: " + shortest + " (длина: " + shortest.length() + ")");
        System.out.println("Средняя длина названия: " + average);
    }
}
