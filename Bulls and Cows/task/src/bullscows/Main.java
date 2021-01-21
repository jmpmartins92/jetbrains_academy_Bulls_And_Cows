package bullscows;


import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int numBulls = 0;
    static int numCows = 0;

    static int numDigits = 0;



    public static int turns(int numberTurns) {
        System.out.printf("\nTurn %d:\n", numberTurns);
        return ++numberTurns;
    }


    public static void gradePrint(int result) {
        switch (result) {
            case 0:
                System.out.println("Grade: None.");
                break;
            case 1:
                System.out.println("Grade: 1 bull.");
                break;
            case 2:
                System.out.println("Grade: 1 cow.");
                break;
            case 3:
                System.out.printf("Grade: %d bulls.\n", numBulls);
                break;
            case 4:
                System.out.printf("Grade: %d cows.\n", numCows);
                break;
            case 5:
                System.out.println("Grade: 1 bull and 1 cow.");
                break;
            case 6:
                System.out.printf("Grade: %d bulls and 1 cow.\n", numBulls);
                break;
            case 7:
                System.out.printf("Grade: 1 bull and %d cows.\n", numCows);
                break;
            case 8:
                System.out.printf("Grade: %d bulls and %d cows.\n", numBulls, numCows);
                break;
            default:
                break;
        }
    }

    public static int result(SecretCode secretCode, String userInput) {
        numBulls = 0;
        numCows = 0;
        int result = 0;
        for (int codeIndex = 0; codeIndex < secretCode.length(); codeIndex++) {
            if (secretCode.charAt(codeIndex) != userInput.charAt(codeIndex)) {
                if (secretCode.indexOf(String.valueOf(userInput.charAt(codeIndex))) != -1) {
                    numCows++;
                }
            } else {
                numBulls++;
            }
        }
        if (numCows == 0) {
            if (numBulls == 0) {
                result = 0;
            } else if (numBulls == 1) {
                result = 1;
            } else {
                result = 3;
            }
        }
        if (numCows == 1) {
            if (numBulls == 0) {
                result = 2;
            } else if (numBulls == 1) {
                result = 5;
            } else {
                result = 6;
            }
        }
        if (numCows > 1) {
            if (numBulls == 0) {
                result = 4;
            } else if (numBulls == 1) {
                result = 7;
            } else {
                result =  8;
            }
        }
        return result;
    }

    public static void inputCodeChecker(int numDigits, int numSymbols) {
        if (numDigits == 0) {
            System.out.println("Error: it's not possible to generate a code with no length");
            System.exit(0);
        }


        if (numDigits > numSymbols) {
            System.out.printf("\nError: it's not possible to generate a code with a " +
                    "length of %d with %d unique symbols.", numDigits, numSymbols);
            System.exit(0);
        }
        if (numSymbols > 36) {
            System.out.printf("Error: maximum number of possible symbols in the code is 36 (0-9, a-z).");
            System.exit(0);
        }
    }

    public static int inputCatch(String input) {
        int inputInt = 0;
        try {
            inputInt = Integer.parseInt(input);
        } catch (Exception e) {
            System.out.println("Error: \"" + input + "\" isn't a valid number");
            System.exit(0);
        }
        return inputInt;
    }


    public static void main(String[] args) {

        int numberTurns = 1;

        System.out.println("Please, enter the secret code's length:");
        String input1 = scanner.nextLine();
        numDigits = inputCatch(input1);
        System.out.println("Input the number of possible symbols in the code:");
        String input2 = scanner.nextLine();
        int numSymbols = inputCatch(input2);
        inputCodeChecker(numDigits, numSymbols);

        
        SecretCode secretCode = new SecretCode();

        secretCode.secretCodeBuilder(numDigits, numSymbols);
        System.out.println("Okay, let's start a game!");
        System.out.println(secretCode);
        String userInput = "";

        do {
            numberTurns = turns(numberTurns);
            userInput = scanner.next();
            gradePrint(result(secretCode, userInput));
        } while (!userInput.equals(secretCode.toString()));
        System.out.printf("Congratulations! You guessed the secret code.");

    }

}



