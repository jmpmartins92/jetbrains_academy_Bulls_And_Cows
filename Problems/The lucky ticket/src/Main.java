import java.util.Scanner;

class Main {

    public static int sum(String halfString) {
        int sum = 0;
        for (char number : halfString.toCharArray()) {
            sum += Character.getNumericValue(number);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String firstHalf = input.substring(0, input.length() / 2);
        String secondHalf = input.substring(input.length() / 2);
        if (sum(firstHalf) == sum(secondHalf)) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }
}