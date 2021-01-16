import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        String word = "the";

        for (int letterIndex = 2; letterIndex < input.length(); letterIndex++) {
            if (input.substring(letterIndex - 2, letterIndex + 1).equals(word)) {
                System.out.println(letterIndex - 2);
                break;
            } else if (letterIndex == input.length() - 1) {
                System.out.println(-1);
            }
        }
    }
}