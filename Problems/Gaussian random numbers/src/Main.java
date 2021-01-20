import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double k = scanner.nextDouble();
        double n = scanner.nextDouble();
        double m = scanner.nextDouble();
        boolean test = false;

        for (int seeds = (int) k; seeds < Integer.MAX_VALUE; seeds++) {
            Random random = new Random(seeds);
            for (int nums = 0; nums < n; nums++) {
                double randomGaussian = random.nextGaussian();
                if (randomGaussian > m) {
                    test = false;
                    break;
                } else if (randomGaussian <= m && nums == n - 1) {
                    test = true;
                }
            }
            if (test) {
                System.out.println(seeds);
                break;
            }

        }




    }
}