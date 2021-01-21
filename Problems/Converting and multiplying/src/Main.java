import java.util.Scanner;



class Main {
    static Scanner scanner = new Scanner(System.in);

    static void converter() {

        String numInput = scanner.nextLine();
        if ("0".equals(numInput)) {
            System.exit(0);
        } else {
            try {
                System.out.println(Integer.parseInt(numInput) * 10);
            } catch (Exception e) {
                System.out.println("Invalid user input: " + numInput);
            }
        }

    }

    public static void main(String[] args) {
        while (scanner.hasNext()) {
            converter();
        }


    }
}