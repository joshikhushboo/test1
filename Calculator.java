import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int ch;
        System.out.println("Enter two numbers:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Choose an operator:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        ch=sc.nextInt();
        switch(ch){
            case 1: 
            System.out.println(a+b);
            break;
            case 2:
            System.out.println(a-b);
            break;
            case 3:
            System.out.println(a*b);
            break;
            case 4:
            System.out.println(a/b);
            break;
            default:
            System.out.println("entered an invalid no.");
        }
        sc.close();


    }
    
}
