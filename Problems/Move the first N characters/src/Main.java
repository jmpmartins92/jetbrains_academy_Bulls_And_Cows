import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int n = scanner.nextInt();
        if (n > input.length()) {
            System.out.println(input);
        } else {
            String firstPart = input.substring(n);
            String secondPart = input.substring(0, n);
            System.out.println(firstPart + secondPart);
        }


    }
}