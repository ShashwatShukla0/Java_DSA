package PrepInsta_Coding;

public class PrimeNo3 {

    static boolean checkPrime(int n,int i){

        if(n<2){
            return false;

        }

        if(n==i){
            return true;
        }
        if(n%i==0){
            return false;
        }
        i +=1;
        return checkPrime(n, i);
    }

    public static void main(String[] args){
        int n=37,i=2;

        boolean res = true;
        res = checkPrime(n, i);

        String rus = res ? "Prime Number" : "Not a prime number";
        System.out.println(rus);
    }
    
}
