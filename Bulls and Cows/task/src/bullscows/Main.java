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


    public static void main(String[] args) {

        int numberTurns = 1;
        //secretCode();
        /*String userCode = userCode();
        gradePrint(result(secretCode, userCode));
        System.out.printf("The secret code is %s.", secretCode);*/
        System.out.println("Please, enter the secret code's length:");
        int numDigits = scanner.nextInt();
        if (numDigits > 10) {
            while (numDigits > 10) {
                System.out.printf("Error: can't generate a secret number with a length of %d " +
                        "because there aren't enough unique digits.\n", numDigits);
                numDigits = scanner.nextInt();
            }
        }

        //int numDigits = 1;
        SecretCode secretCode = new SecretCode();
        secretCode.secretCodeBuilder(numDigits);
        System.out.println("Okay, let's start a game!");
        String userInput = "";

        do {
            numberTurns = turns(numberTurns);
            userInput = scanner.next();
            gradePrint(result(secretCode, userInput));
        } while (!userInput.equals(secretCode.toString()));
        System.out.printf("Congratulations! You guessed the secret code.");

    }

}



