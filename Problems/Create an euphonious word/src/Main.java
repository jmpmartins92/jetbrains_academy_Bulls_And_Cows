import java.util.*;

public class Main {



    public static String cvString(String input) {
        String VOWELS = "aeiouy";
        String cvString = "";
        for (int letterIndex = 0; letterIndex < input.length(); letterIndex++) {
            if (VOWELS.contains(input.substring(letterIndex, letterIndex + 1))) {
                cvString += "v";
            } else {
                cvString += "c";
            }
        }
        return cvString;
    }

    public static int counter(String cvString) {
        int counter = 0;
        for (int letterIndex = 2; letterIndex < cvString.length(); letterIndex++) {
            if (cvString.substring(letterIndex - 2, letterIndex + 1).equals("ccc") ||
                    cvString.substring(letterIndex - 2, letterIndex + 1).equals("vvv")) {
                counter++;
                letterIndex++;
            }
        }
        return counter;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        System.out.println(counter(cvString(input)));
    }
}