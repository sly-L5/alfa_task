import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int passCount = 0;
        int flakyCount = 0;
        int bugCount = 0;
        int criticalCount = 0;
        
        boolean noiseFilter = false;
        boolean stopSignal = false;
        String criticalNumbers = "";
        
        System.out.print("Включить шумоподавление? (да/нет): ");
        String noiseInput = scanner.nextLine();
        if (noiseInput.equalsIgnoreCase("да")) {
            noiseFilter = true;
        }
        System.out.print("Включить стоп-сигнал? (да/нет): ");
        String stopInput = scanner.nextLine();
        if (stopInput.equalsIgnoreCase("да")) {
            stopSignal = true;
        }
        for (int i = 1; i <= 100; i++) {
            String status = "";
            
            if (i % 3 == 0 && i % 5 == 0) {
                status = "Critical!";
                criticalCount++;
                if (criticalNumbers.isEmpty()) {
                    criticalNumbers = criticalNumbers + i;
                } else {
                    criticalNumbers = criticalNumbers + ", " + i;
                }
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
            boolean shouldPrint = true;
            if (noiseFilter && status.equals("Pass")) {
                shouldPrint = false;
            }
            if (shouldPrint) {
                System.out.println("Тест #" + i + ": " + status);
            }
            if (stopSignal && criticalCount >= 3) {
                System.out.println("\nДостигнуто 3 критических теста! Программа остановлена.");
                break;
            }
        }
        
        System.out.println("\n=========== Итоги ночной смены ===========");
        System.out.println("Всего тестов: 100");
        System.out.println("Pass: " + passCount);
        System.out.println("Flaky: " + flakyCount);
        System.out.println("Bug: " + bugCount);
        System.out.println("Critical: " + criticalCount);
        
        if (stopSignal) {
            System.out.println("\nНомера критических тестов: " + criticalNumbers);
        }
        scanner.close();
    }
}
