import java.util.Scanner;

public class Main {
    private static final String NULL_MARKER = "NULL";
    private static final String RESERVED_FRAGMENT = "XX";
    private static final String SEPARATOR = "#";
    private static final int PARTS_COUNT = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= PARTS_COUNT; i++) {
            System.out.print("Введите часть " + i + ": ");
            String part = scanner.nextLine();

            if (part.equalsIgnoreCase(NULL_MARKER)) {
                System.out.println("Часть сообщения повреждена! Используем резервный фрагмент...");
                part = RESERVED_FRAGMENT;
            }

            if (i > 1) {
                result.append(SEPARATOR).append(part);
            } else {
                result.append(part);
            }
        }

        scanner.close();
        System.out.println("Расшифрованное послание: " + result.toString());
    }
}
