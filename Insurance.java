import java.util.Scanner;
public class Insurance {
    static void Policy(int age, String gender,String city){
        if(age>25 & age<30 & gender=="m" & city=="metro"){
            System.out.println("premium is 6%");
        }
        else if(age>25 & age<40 & gender=="m"& city=="nonmetro"){
            System.out.println("premium is 4%");
        }
       else if(age>25 & age<42 & gender=="f"& city=="metro"){
            System.out.println("premium is 3%");
        }
        else if(age>25 & age<45 & gender=="f"& city=="nonmetro"){
            System.out.println("premium is 2%");
        }
        
        else{
            System.out.println("not insured!!!");
        }
    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter name:");
        String name=sc.nextLine();
       
        System.out.println("enter gender:");
        String gender=sc.nextLine();
       
        System.out.println("enter age");
        int age=sc.nextInt();
      
        System.out.println("enter city(metro or nonmetro):");
        String city=sc.nextLine();
        Policy(age, gender, city);
        sc.close();
        
    }
    
}
