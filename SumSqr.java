import java.util.Scanner;

public class SumSqr {
    public static int calculateSumOfSeries(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int sum = calculateSumOfSeries(n);
        System.out.println("Sum of the series 1^2 + 2^2 + ... + " + n + "^2 = " + sum);
        input.close();
    }
}