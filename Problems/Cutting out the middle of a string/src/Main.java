import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = "";
        if (input.length() % 2 == 0) {
            output = input.substring(0, input.length() / 2 - 1) + input.substring(input.length() / 2 + 1);
        } else {
            output = input.substring(0, input.length() / 2) + input.substring(input.length() / 2 + 1);
        }
        System.out.println(output);
    }
}