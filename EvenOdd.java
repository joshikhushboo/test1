import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("enter n=");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            if(i%2==0){
                  System.out.println("Even");
                  System.out.println(i);
            }
            else{
                System.out.println("odd");
                System.out.println(i);
            
        }
    }
    
}}
