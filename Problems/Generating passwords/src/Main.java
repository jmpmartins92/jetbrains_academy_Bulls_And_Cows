import java.util.*;

public class Main {

    public static String passSub(int numSymbol, char symbol) {
        String passSub = "";
        for (int i = 0; i < numSymbol; i++) {
            passSub += Character.toString(symbol);
            if (i % 2 == 0) {
                symbol++;
            } else if (i % 2 != 0) {
                symbol--;
            }
        }
        return passSub;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numUpperCase = scanner.nextInt();
        int numLowerCase = scanner.nextInt();
        int numDigits = scanner.nextInt();
        int numSymbols = scanner.nextInt();
        String password = passSub(numUpperCase, 'B') +
                passSub(numLowerCase, 'b') +
                passSub(numDigits, '1');
        if (password.length() < numSymbols) {
            int addSymbols = numSymbols - password.length();
            password += passSub(addSymbols, '#');
        }
        System.out.println(password);

    }
}