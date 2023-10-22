import java.util.Scanner;
public class Leapyears {
    static void Leap(int year){
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){
                    System.out.println("it is a leap year");
}
        else{
            System.out.println("not");
}

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENter year:");
        int year=sc.nextInt();
        Leap(year);

        
    }
    
}
