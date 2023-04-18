package PrepInsta_Coding;

public class ArmStrong {

    static int order(int n){
        int len = 0;
        while(n>0){
            len++;
            n=n/10;
        }
        return len;
    }
    static int Sarmstrong(int n,int len){
        if(n==0){
            return 0;
        }
        int digit = n%10;

        return (int) Math.pow(digit,len) + Sarmstrong(n/10, len); 
    }

    public static void main(String[] args){

        int n=153;
        int len = order(n);
        System.out.println(Sarmstrong(n, len));
        if(n == Sarmstrong(n,len)){
            System.out.println("Is a Armstrong");
        } else {
            System.out.println("Is not a Armstrong");
        }
    }
    
}
