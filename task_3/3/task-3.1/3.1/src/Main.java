public class Main {
    public static void main(String[] args) {
        String[] petia = {"курица", "бананы", "творог"};
        String[] kolia = {"курица", "бананы", "творог"};
        String[] terentii = {"пиво", "пельмени", "ласка магия черного"};

        System.out.println("=== Сравнение по количеству товаров ===");

        if (petia.length == kolia.length) {
            System.out.println("Количество товаров у Пети и Коли одинаковое: " + petia.length);
        } else {
            System.out.println("Количество товаров у Пети и Коли разное");
        }

        if (petia.length == terentii.length) {
            System.out.println("Количество товаров у Пети и Терентия одинаковое: " + petia.length);
        } else {
            System.out.println("Количество товаров у Пети и Терентия разное");
        }

        System.out.println("\n=== Сравнение по составу ===");

        boolean equal = true;
        if (petia.length != kolia.length) {
            equal = false;
        } else {
            for (int i = 0; i < petia.length; i++) {
                if (!petia[i].equals(kolia[i])) {
                    equal = false;
                }
            }
        }

        if (equal) {
            System.out.println("Состав корзин у Пети и Коли одинаковый");
        } else {
            System.out.println("Состав корзин у Пети и Коли разный");
        }

        equal = true;
        if (petia.length != terentii.length) {
            equal = false;
        } else {
            for (int i = 0; i < petia.length; i++) {
                if (!petia[i].equals(terentii[i])) {
                    equal = false;
                }
            }
        }

        if (equal) {
            System.out.println("Состав корзин у Пети и Терентия одинаковый");
        } else {
            System.out.println("Состав корзин у Пети и Терентия разный");
        }

        System.out.println("\n=== Исследование длин названий ===");

        String[] allItems = new String[petia.length + kolia.length + terentii.length];
        int index = 0;

        for (int i = 0; i < petia.length; i++) {
            allItems[index] = petia[i];
            index++;
        }

        for (int i = 0; i < kolia.length; i++) {
            allItems[index] = kolia[i];
            index++;
        }

        for (int i = 0; i < terentii.length; i++) {
            allItems[index] = terentii[i];
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