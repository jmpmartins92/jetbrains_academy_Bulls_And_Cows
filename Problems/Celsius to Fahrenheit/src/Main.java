import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tempC = scanner.nextDouble();
        System.out.println(tempC * 1.8 + 32);
    }
}