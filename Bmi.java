import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        float bmi;
        System.out.println("enter weight(in kg):");
        float a=obj.nextFloat();
        System.out.println("Enter height(in m):");
        float b=obj.nextFloat();
        bmi=a/(b*b);
         System.out.println("BMI"+bmi);
         System.out.println(bmi<20?"underweight":(bmi==20 || bmi<=25?"normal weight":(bmi>25 || bmi<28?"over weight":"obese")));
    }
    
}
