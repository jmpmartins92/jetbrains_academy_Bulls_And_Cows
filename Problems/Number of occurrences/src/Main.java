import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String inputSubString = scanner.nextLine();
        int counter = 0;
        String auxString = inputString;
        for (int tries = 0; tries < inputString.length(); tries++) {
            if (auxString.replaceFirst(inputSubString, "").equals(auxString)) {
                break;
            } else {
                auxString = auxString.replaceFirst(inputSubString, "");
                counter++;
            }

        }
        System.out.println(counter);
    }
}