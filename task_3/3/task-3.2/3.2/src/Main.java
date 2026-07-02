public class Main {
    public static void main(String[] args) {
        String[] passwords = {"securePass123", "1qwerty", "myPasswordz"};

        for (int i = 0; i < passwords.length; i++) {
            String pwd = passwords[i];
            boolean result = true;

            if (pwd.length() <= 8) {
                result = false;
            }

            if (pwd.charAt(0) == '1') {
                result = false;
            }

            if (pwd.charAt(pwd.length() - 1) == 'z') {
                result = false;
            }

            if (pwd.contains("1234")) {
                result = false;
            }

            if (pwd.contains("qwerty")) {
                result = false;
            }

            System.out.println("пароль \"" + pwd + "\" прошёл проверку: " + result);
        }
    }
}