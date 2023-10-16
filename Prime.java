import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        System.out.println("enter a number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==2||n==3){
            System.out.println("prime");
        }
        else if(n%2==0 || n%3==0){
            System.out.println("Not a prime");
        }
        else{
            System.out.println("not a prime");
        }

        }
        
    }
    

