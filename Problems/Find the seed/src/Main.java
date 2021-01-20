import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int numNumbers = scanner.nextInt();
        int k = scanner.nextInt();

        int seed = 0;

        int minMax = Integer.MAX_VALUE;
        for (int seeds = a; seeds <= b; seeds++) {
            int maxNum = Integer.MIN_VALUE;
            Random random = new Random(seeds);
            for (int number = 0; number < numNumbers; number++) {
                int num = random.nextInt(k);
                if (num > maxNum) {
                    maxNum = num;
                }
            }
            if (maxNum < minMax) {
                minMax = maxNum;
                seed = seeds;
            }
        }

        System.out.println(seed);
        System.out.println(minMax);
    }
}