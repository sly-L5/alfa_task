public class Main {
    private static final int MIN_PASSWORD_LENGTH = 8;
    private static final char FIRST_CHAR_FORBIDDEN = '1';
    private static final char LAST_CHAR_FORBIDDEN = 'z';
    private static final String FORBIDDEN_SUBSTRING_1 = "1234";
    private static final String FORBIDDEN_SUBSTRING_2 = "qwerty";

    public static void main(String[] args) {
        String[] passwords = {"securePass123", "1qwerty", "myPasswordz"};

        for (int i = 0; i < passwords.length; i++) {
            String pwd = passwords[i];
            boolean isValid = true;

            if (pwd.length() <= MIN_PASSWORD_LENGTH) {
                isValid = false;
            }

            if (pwd.charAt(0) == FIRST_CHAR_FORBIDDEN) {
                isValid = false;
            }

            if (pwd.charAt(pwd.length() - 1) == LAST_CHAR_FORBIDDEN) {
                isValid = false;
            }

            if (pwd.contains(FORBIDDEN_SUBSTRING_1)) {
                isValid = false;
            }

            if (pwd.contains(FORBIDDEN_SUBSTRING_2)) {
                isValid = false;
            }

            System.out.println("пароль \"" + pwd + "\" прошёл проверку: " + isValid);
        }
    }
}
