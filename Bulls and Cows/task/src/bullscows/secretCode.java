package bullscows;
import java.util.Random;
import javax.swing.*;

class SecretCode {
    Random random = new Random();
    StringBuilder secretCode = new StringBuilder("");

    public StringBuilder secretCodeBuilder (int numDigits, int numSymbols) {
        while (secretCode.length() < numDigits) {
            secretCode = secretCode.append(randomizer(numSymbols));

            for (int index = 0; index < secretCode.length() - 1; index++) {
                if (secretCode.charAt(index) == secretCode.charAt(secretCode.length() - 1)) {
                    secretCode.deleteCharAt(index);
                }
            }

        }
        System.out.printf("\nThe secret is prepared: %s %s.\n", codeSize(numDigits), codeRange(numSymbols));
        return secretCode;
    }

    public String codeSize(int numDigits) {
        String sizeStars = "";
        for (int digit = 0; digit < numDigits; digit++) {
            sizeStars += "*";
        } return sizeStars;
    }

    public String codeRange(int numSymbols) {
        String range = "";
        if (numSymbols < 11) {
            range = "(0-" + (numSymbols - 1) + ")";
        } else {

            range = "(0-9, a-" + (char) (numSymbols + 97 - 11) + ")";
        }
        return range;
    }

    private String randomizer(int numSymbols) {
        int randomValue = random.nextInt(numSymbols);
        String randomString = "";
        if (randomValue < 11) {
             if (randomValue == 10) {
                 randomValue = 0;
             }
             randomString = Integer.toString(randomValue);
        } else {
            randomString = Character.toString((char) (randomValue + 97 - 11));
        }
        return randomString;
    }

    public char charAt(int codeIndex) {
        return secretCode.charAt(codeIndex);
    }

    public int indexOf(String userCode) {
        return secretCode.indexOf(userCode);
    }

    public String toString() {
        return secretCode.toString();
    }

    public int length() {
        return secretCode.length();
    }

}
