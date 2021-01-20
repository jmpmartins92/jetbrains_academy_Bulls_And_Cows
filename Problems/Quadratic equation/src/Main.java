import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double root1 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        double root2 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);

        System.out.println(Math.min(root1, root2) + " " + Math.max(root1, root2));


    }
}