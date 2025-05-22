import java.util.Random;

public class Main {

    public static String generatePassword(int length) {
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(lowercase.length());
            password.append(lowercase.charAt(index));
        }

        return password.toString();
    }

    public static void main(String[] args) {
        int length = 10; 
        System.out.println("Сгенерированный пароль: " + generatePassword(length));
    }
}