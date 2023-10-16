import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        System.out.println("enter your name");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("enter your salary:");
         int sal=sc.nextInt();
         float gross=sal+(20/100 *sal)+(30/100 *sal)+2000;
         System.out.println("gross"+gross);
         
    }
}
