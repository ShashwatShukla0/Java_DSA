package PrepInsta_Coding;

public class Power {

    public static void main(String[] args){
        int n = 18;
        int pow = 4;
        int res=1;
        while(pow>0){
            res *= n ;
            pow--;
        }

        System.out.println(res);
    }
    
}
