package PrepInsta_Coding;

public class PrimeNo2 {

    static boolean isPrime(int n){

        if(n<=1){
            return false;

        }
        else if(n ==2){
            return true;
        } else if( n%2==0){
            return false;
        }
        for(int i=3;i<=Math.sqrt(n); i +=2){
                if(n%i==0){
                    return false;
                }
            }
        return true;
    }

    public static void main(String[] args){

        int n = 49;
        if(isPrime(n)){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a prime number");
        }
    }
    
}
