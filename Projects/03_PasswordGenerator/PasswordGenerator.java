import java.util.Random;

public class PasswordGenerator {
    public void main() {

        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*()-_=+[{]};:,<.>/?";

        String passwordPool = upperCase + lowerCase + numbers + symbols;
        int passwordPoolLength = passwordPool.length();

        int passwordLength = 15;
        StringBuilder password = new StringBuilder();
        Random random = new Random();

        boolean lowerCaseIncluded = false, upperCaseIncluded = false, numIncluded = false, symbolIncluded = false;
        for (int i = 0; i < passwordLength; i++) {
            int randomIndex = random.nextInt(passwordPoolLength);
            char randomChar = passwordPool.charAt(randomIndex);

            password.append(randomChar);

            if (!lowerCaseIncluded && lowerCase.indexOf(randomChar) != -1)
                lowerCaseIncluded = true;
            else if (!upperCaseIncluded && upperCase.indexOf(randomChar) != -1)
                upperCaseIncluded = true;
            else if (!numIncluded && numbers.indexOf(randomChar) != -1)
                numIncluded = true;
            else if (!symbolIncluded && symbols.indexOf(randomChar) != -1)
                symbolIncluded = true;

            if (i == passwordLength - 1) {
                boolean isPasswordComplete = lowerCaseIncluded && upperCaseIncluded && numIncluded && symbolIncluded;
                if (!isPasswordComplete) {
                    i = 0;
                    System.out.println("Failed to make strong password. Trying Again...");
                    continue;
                }
            }
        }
        System.out.println(password);
    }
}