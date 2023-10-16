import java.util.Scanner;


public class Age {
    public static void main(String[] args) {
        
    
    System.out.println("enter n:");
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    System.out.println(n<14?"child":(n==14 || n<17?"teenager":(n==17 ||n<=60?"adult":"senior citizen")));
    }
}
