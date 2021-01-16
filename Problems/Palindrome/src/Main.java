import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String test = "no";
        if (input.matches(".*\\d.*")) {
            test = "no";
        } else if (input.length() < 2) {
            test = "yes";
        } else {
            for (int letterIndex = 0; letterIndex < input.length() / 2; letterIndex++) {
                if (input.charAt(letterIndex) == input.charAt(input.length() - 1 - letterIndex)) {
                    test = "yes";
                } else {
                    test = "no";
                    break;
                }
            }
        }
        System.out.println(test);
    }
}