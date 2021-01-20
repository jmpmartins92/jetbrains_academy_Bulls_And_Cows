package bullscows;
import java.util.Random;
import javax.swing.*;

class SecretCode {
    Random random = new Random();
    StringBuilder secretCode = new StringBuilder("");

    public StringBuilder secretCodeBuilder (int numDigits) {
        while (secretCode.length() < numDigits) {
            secretCode = secretCode.append(randomizer());
            if (secretCode.charAt(0) == '0') {
                secretCode.replace(0, 1, randomizer());
            }
            for (int index = 0; index < secretCode.length() - 1; index++) {
                if (secretCode.charAt(index) == secretCode.charAt(secretCode.length() - 1)) {
                    secretCode.deleteCharAt(index);
                }
            }
        } return secretCode;
    }

    private String randomizer() {
        return Integer.toString(random.nextInt(10));
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
