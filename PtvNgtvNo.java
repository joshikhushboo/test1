import java.util.Scanner;

public class PtvNgtvNo {
    public static String checkNumber(double number) {
        if (number > 0) {
            return "The entered number is positive.";
        } else if (number < 0) {
            return "The entered number is negative.";
        } else {
            return "The entered number is zero.";
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = input.nextDouble();
        String result = checkNumber(number);
        System.out.println(result);
        input.close();
    }
}