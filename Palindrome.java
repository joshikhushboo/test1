import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
    int n,sum=0,r;
    System.out.println("enter number:");
    Scanner obj=new Scanner(System.in);
    n=obj.nextInt();
    int x=n;
    
r=n%10;
sum=sum*10+r;
n=n/10;
r=n%10;
sum=sum*10+r;
n=n/10;
r=n%10;
sum=sum*10+r;
n=n/10;
if(sum==x){
    System.out.println("palindrome");
}
else{
    System.out.println("not");
}

    }}
