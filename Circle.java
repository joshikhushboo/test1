import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        
    System.out.println("enter radius:");
    Scanner obj=new Scanner(System.in);
    float r=obj.nextFloat();
    
    System.out.println(Math.PI*r*r);
    }
    
}
