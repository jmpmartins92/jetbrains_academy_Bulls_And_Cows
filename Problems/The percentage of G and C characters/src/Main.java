import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        int numG = 0;
        int numC = 0;
        for (int letter = 0; letter < input.length(); letter++) {
            if (input.charAt(letter) == 'g') {
                numG++;
            }
            if (input.charAt(letter) == 'c') {
                numC++;
            }
        }
        double result = (double) (numC + numG) / input.length() * 100;
        System.out.println(result);
    }
}