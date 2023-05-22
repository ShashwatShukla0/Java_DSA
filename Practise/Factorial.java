package Practise;

public class Factorial {

    public static int factp(int n) {
        if(n==0 || n==1){
            return 1;
        }

        return (n*factp(n-1));
    }
    public static void main(String[] args) {

        int n=6;
        // long fact = 1;

        // for(int i=1;i<=n;i++){
        //     fact = fact*i;
        // }
        // System.out.println(fact);

        System.out.println(factp(n));

    }
    
}
