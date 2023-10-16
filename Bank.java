import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int deposit=0;
        int balance=01,withdraw=0;
        System.out.println("Choose a required key:\n1.Deposit\n2.Balance\n3.Withdraw");
        int n=sc.nextInt();
        while( ){
        switch(n){
            case 1:
            System.out.println("Enter ammount:");
            deposit=sc.nextInt();
            System.out.println("depositted succesfully!!");
            break;
            
            case 2:
            System.out.println("your balance is:");
            System.out.println((balance+deposit)-withdraw);
            break;
            case 3:
            System.out.println("Enter ammount:");
            withdraw=sc.nextInt();

            default:
            System.out.println("entered wrong!!");
        }}
        

    }
    
}
