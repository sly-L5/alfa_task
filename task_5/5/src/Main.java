import java.util.Random;

public class Main {

    public static String generateAccessCode() {
        int year = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        int number = (int) Math.pow(3, 7);
        String code = year + "-" + number;
        return code;
    }

    private static boolean isValidCode(String code, int minLength) {
        if (code == null) {
            return false;
        }
        if (code.length() < minLength) {
            return false;
        }
        if (code.contains("-") == false) {
            return false;
        }
        return true;
    }

    public static String logEvent(String message, boolean isCritical) {
        if (isCritical) {
            return "КРИТИЧНО: " + message;
        } else {
            return "ИНФО: " + message;
        }
    }

    public static String generateAgentId(String prefix, int seed) {
        Random random = new Random(seed);
        int number = random.nextInt(9000);
        number = number + 1000;
        String id = prefix + "-" + number;
        return id;
    }

    public static void main(String[] args) {
        System.out.println("=== ЗАПУСК СИСТЕМЫ ===");
        
        String code = generateAccessCode();
        System.out.println("Код доступа: " + code);
        
        boolean result = isValidCode(code, 8);
        System.out.println("Код валидный? " + result);
        
        String log1 = logEvent("Server protection activated", false);
        System.out.println(log1);
        
        String log2 = logEvent("Intrusion attempt detected", true);
        System.out.println(log2);
        
        String agent1 = generateAgentId("AGENT", 42);
        System.out.println(agent1);
        
        String agent2 = generateAgentId("AGENT", 77);
        System.out.println(agent2);
        
        String agent3 = generateAgentId("AGENT", 13);
        System.out.println(agent3);
    }
}
