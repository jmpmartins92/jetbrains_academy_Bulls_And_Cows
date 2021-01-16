import java.util.Scanner;

class Main {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = input.substring(0, 1);
        int sumLetters = 1;

        if (input.length() == 1) {
            output = input + "1";
        }


        for (int index = 1; index < input.length(); index++) {

            if (input.charAt(index) == input.charAt(index - 1)) {
                sumLetters++;
            } else {
                output += sumLetters + input.substring(index, index + 1);
                sumLetters = 1;
            }
            if (index == input.length() - 1) {
                output += sumLetters;
            }

        }
        System.out.println(output);
    }

}