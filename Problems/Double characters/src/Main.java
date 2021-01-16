import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] letters = input.split("");
        String output = "";
        for (String letter : letters) {
            output += letter + letter;
        }
        System.out.println(output);
    }
}