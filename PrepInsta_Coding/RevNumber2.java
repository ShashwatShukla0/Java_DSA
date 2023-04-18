package PrepInsta_Coding;

public class RevNumber2 {

    static int revNum(int n){
        if(n==0){
            return 0;
        }

        int rem = n%10;
        System.out.print(rem);
        return revNum(n/10);
    }

    public static void main(String[] args){

        int n = 34214;

        revNum(n);
    }
    
}
