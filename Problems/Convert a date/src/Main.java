import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputDate = scanner.nextLine();
        String outputDate = inputDate.substring(5, 7)  + "/" +
                inputDate.substring(inputDate.length() - 2) + "/" +
                inputDate.substring(0, 4);
        System.out.println(outputDate);
    }
}