import java.util.Scanner;

class Main {

    public static double vectorLength(int x, int y) {
        return Math.sqrt(x * x + y * y);
    }

    public static double vectorProduct(int x1, int y1, int x2, int y2) {
        return x1 * x2 + y1 * y2;
    }

    public static double cosVector(double length1, double length2, double vecProduct) {
        return vecProduct / (length1 * length2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        double length1 = vectorLength(x1, y1);
        double length2 = vectorLength(x2, y2);
        double vecProduct = vectorProduct(x1, y1, x2, y2);
        double cosVector = cosVector(length1, length2, vecProduct);
        System.out.println(Math.toDegrees(Math.acos(cosVector)));





    }
}