import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
         System.out.println("Enter length and breadth:");
        Scanner obj=new Scanner(System.in);
        double a=obj.nextDouble();
        double b=obj.nextDouble();
        System.out.println(a*b);
    }
}
