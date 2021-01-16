import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean test = false;
        char[] arrayLetters = input.toCharArray();
        if (arrayLetters.length < 2) {
            test = true;
        } else {
            for (int i = 1; i < arrayLetters.length; i++) {
                if (arrayLetters[i] == arrayLetters[i - 1] + 1) {
                    test = true;
                } else {
                    test = false;
                    break;
                }
            }
        }
        System.out.println(test);
    }
}