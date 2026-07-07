import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int passCount = 0;
        int flakyCount = 0;
        int bugCount = 0;
        int criticalCount = 0;

        for (int i = 1; i <= 100; i++) {
            String status = "";

            if (i % 3 == 0 && i % 5 == 0) {
                status = "Critical!";
                criticalCount++;
            } else if (i % 3 == 0) {
                status = "Flaky";
                flakyCount++;
            } else if (i % 5 == 0) {
                status = "Bug";
                bugCount++;
            } else {
                status = "Pass";
                passCount++;
            }

            System.out.println("Тест #" + i + ": " + status);
        }

        System.out.println("=========== Итоги ночной смены ===========");
        System.out.println("Всего тестов: 100");
        System.out.println("Pass: " + passCount);
        System.out.println("Flaky: " + flakyCount);
        System.out.println("Bug: " + bugCount);
        System.out.println("Critical: " + criticalCount);
    }
}