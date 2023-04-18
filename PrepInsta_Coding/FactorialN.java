package PrepInsta_Coding;

public class FactorialN {

    static long fact(Long n){
        if(n==0 || n==1){
            return 1;
        }

        return n*fact(n-1);
  }

    public static void main(String[] args){

        long n=17;
        System.out.println(fact(n));
    }
    
}
