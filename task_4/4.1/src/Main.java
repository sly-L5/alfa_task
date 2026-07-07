import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "";

        for (int i = 1; i <= 5; i++) {
            System.out.print("Введите часть " + i + ": ");
            String part = scanner.nextLine();

            if (part.equalsIgnoreCase("NULL")) {
                System.out.println("Часть сообщения повреждена! Используем резервный фрагмент...");
                part = "XX";
            }

            if (i > 1) {
                result = result + "#" + part;
            } else {
                result = result + part;
            }
        }

        System.out.println("Расшифрованное послание: " + result);
    }
}