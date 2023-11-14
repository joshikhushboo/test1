public class SumDigits {
    static int digit(int n,int sum){
        if(n==0){
            return sum;
        }
        sum=sum+n%10;
        n=n/10;
        return digit(n, sum); 
        
    }
    public static void main(String[] args) {
        System.out.println(digit(1234,0));
    }
    
}
