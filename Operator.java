import java.util.Scanner;
class Parent{}
class Child1 extends Parent{}
class Child2 extends Parent{}

public class Operator {
         
    public static void main(String[] args) {
    
        System.out.println("enter age:");
        Scanner a=new Scanner(System.in);
        int age=a.nextInt();
        //bitwise operators
        int b=10;
        int c=10;
        System.out.println(b&c);
        //instanceof
        Parent p=new Child1();
        Parent pp=new Child2();
        System.out.println(p instanceof Child1);

        
    }
    
}
