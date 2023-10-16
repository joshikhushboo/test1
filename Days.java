import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        System.out.println("enter number of day=");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1){
            System.out.println("Monday");
        }
        else if(n==2){
            System.out.println("TUesday");
        }
         else if(n==3){
            System.out.println("Wednesday");
        }
         else if(n==4){
            System.out.println("THursday");
        }
         else if(n==5){
            System.out.println("Friday");
        }
         else if(n==6){
            System.out.println("Saturday");
        }
         else if(n==7){
            System.out.println("SUnday");
        }
        else{
            System.out.println("invalid number");
        }
    }
    
}
