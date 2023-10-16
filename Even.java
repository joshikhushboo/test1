import java.util.Scanner;
public class Even {
    public static void main(String[] args) {
    System.out.println("enter n:");
    Scanner a= new Scanner (System.in);
    int n=a.nextInt();
    System.out.println(n%2==0?"even":"odd");


    }
}
