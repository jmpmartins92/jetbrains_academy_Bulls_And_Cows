import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger fact = BigInteger.ONE;
        BigInteger input = scanner.nextBigInteger();
        for (BigInteger num = BigInteger.ONE;
            num.compareTo(input) == -1; num = num.add(BigInteger.ONE)) {
            fact = fact.multiply(num);

            if (fact.compareTo(input) == 1 || fact.compareTo(input) == 0) {
                System.out.println(num);
                System.exit(0);
            }
        }
    }
}