public class primenum {
    static boolean prime(int n,int i){
        if(i==1){
            return true;
        }
        else if(n%i==0){
            return false;

        }
        else{
            return prime(n,i-1);
        }


    }
    public static void main(String[] args) {
        int n=10;
        int i=2;
        while(i<=n){
            if(prime(i,i/2)){
                System.out.println(i+" ");
            }
            i++;
        }
        
    }
    
}
