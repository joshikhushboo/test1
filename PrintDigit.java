public class PrintDigit {
    static void digit(int n){
        if(n==0){
            return;
        }
        digit(n/10);
        System.out.println(n%10);
        
    }
    public static void main(String[] args) {
        digit(1234);
    }
    
}
