import java.util.Scanner;

public class Allper {
    private static Scanner scanner = new Scanner(System.in);

    public static double readNumber(String prompt, double min, double max) {
        double value;
        while (true) {
            System.out.println(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                return value;
            System.out.println("Enter another value between : " + min + " and " + max);
        }
    }
}
