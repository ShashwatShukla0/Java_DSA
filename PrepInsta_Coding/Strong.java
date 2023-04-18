package PrepInsta_Coding;

public class Strong {

    static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }

        return n*fact(n-1);
    }

    public static void main(String[] args){

        int n= 135;
        int temp = n;
        int rem = 0,res=0,sum=0;
        while(n>0){
            rem = n%10;
            res= fact(rem);
            sum += res;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("Is Strong number");

        } else {
            System.out.println("Not a strong number");
        }
    }
    
}
