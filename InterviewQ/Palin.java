package InterviewQ;

public class Palin {

    public static void main(String[] args) {

        int n = 141;
        int res = 0;

        while(n>0){
            int temp = n%10;
            res = res*10 + temp;
            n = n/10;
        }

        System.out.println(res);
    }
    
}
