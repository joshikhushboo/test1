import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Grading {
    public static void main(String[] args) {
        System.out.println("ENter marks:");
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        if(marks>=90){
            System.out.println("GRAde=A");

        }
        else if (marks<90&marks>=80){
            System.out.println("GRAde=B");
            
        } 
        else if(marks<80&marks>=70){
            System.out.println("Grade=C");
        }
        else if(marks<70&marks>=60){

            System.out.println("Grade=D");
        }
        else if(marks<60 & marks>=50){
            System.out.println("Grade=E");
        }
        else{
            System.out.println("Grade=F");
        }
        }
            
        
        
    }
    

