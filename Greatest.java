import java.util.Scanner;
public class Greatest {
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers:");
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c=obj.nextInt();
        System.out.println(a>b && a>c?"A is greater":(b>c && b>a?"B is greater":"c is the greatest"));

    }
    
}
