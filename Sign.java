import java.util.Scanner;

public class Sign {
    public static void main(String[] args) {
     System.out.println("enter n:");
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    System.out.println(n>0?"positive":(n<0?"negative":"zero"));

    }
    
}
