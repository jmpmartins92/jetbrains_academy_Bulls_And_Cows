package bullscows;



public class Main {
    static int numBulls = 0;
    static int numCows = 0;
    static int numberTurns = 0;

    public static int secretCode() {
        int secretCode = 1234;
        System.out.println("The secret code is prepared: ****.");
        return secretCode;
    }

    public static int turns(int numberTurns) {
        System.out.printf("\nTurn %d. Answer: ", numberTurns);
        int userInput = 4321;
        numberTurns++;
        return userInput;
    }
    public static void gradePrint(int result) {
        switch (result) {
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

    public static int result(int secretCode, int userInput) {


        if (secretCode != userInput) {
            numBulls = 0;
            numCows = 0;
            return 1;
        } else {
            return 0;
        }
    }


    public static void main(String[] args) {
        /*int secretCode = secretCode();
        int userInput = turns(numberTurns);
        do {
            turns(numberTurns);
            gradePrint(result(secretCode, userInput));
        } while (userInput != secretCode);
        System.out.printf("Congrats! The secret code is %d", secretCode);
        System.exit(0);*/
        secretCode();
        System.out.println("\nTurn 1. Answer: ");
        System.out.println("1111");
        System.out.printf("Grade: 1 bull.\n");
        System.out.println("\nTurn 2. Answer: ");
        System.out.println("1234");
        System.out.printf("Grade: 4 bulls.\n");
        System.out.println("Congrats! The secret code is 1234");


    }
}
