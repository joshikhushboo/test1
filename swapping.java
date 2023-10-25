import java.util.Scanner;
public class swapping {
    static void without(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping="+a + b); 

    }
    static void with(int a,int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("swapped number(with third variable):"+a+b);


    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("enter b:");
        int b=sc.nextInt();
        System.out.println("number before swapping"+a + b);
        without(a, b);
        with(a, b);

        
    }
    
}
