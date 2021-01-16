import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = "";
        String website = scanner.nextLine();

        String[] websiteParameters = website.split("\\?")[1].split("&");

        for (String parameters :  websiteParameters) {
            String[] parameterInfo = parameters.split("=");
            String parameterName;
            String parameterResult;

            if (parameterInfo.length == 1) {
                parameterName = parameterInfo[0];
                parameterResult = "not found";
            } else {
                parameterName = parameterInfo[0];
                parameterResult = parameterInfo[1];
            }

            System.out.printf("%s : %s\n", parameterName, parameterResult);

            if ("pass".equals(parameterName)) {
                password = "password" + " : " + parameterResult;
            }
        }
        System.out.println(password);


    }
}