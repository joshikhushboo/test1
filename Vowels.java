import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
    System.out.println("enter an alphabet:");
    Scanner obj=new Scanner(System.in);
    char ch=obj.next().charAt(0);
    if(ch=='a'|| ch=='A'|| ch=='e'|| ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
        System.out.println("It is vowel!!");
    }
    else{
        System.out.println("It is a consonant.");
    }
    sc.close();
    }
    
}
