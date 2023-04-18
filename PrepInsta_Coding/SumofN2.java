package PrepInsta_Coding;

public class SumofN2 {

    static int getSum(int n){
        if(n==0){
            return 0;
        }

        return n+getSum(n-1);
    }

    public static void main(String[] args)
    {
        int n=6;
        System.out.println(getSum(n));
    }
    
}
