package InterviewQ;

public class ArmmStrong {

    public static void main(String[] args) {

        int n = 371;
        int rus = n;
        int res = 0;
        while(n>0) {
            int temp = n%10;
            res += temp*temp*temp;
            n = n/10;
        }
        System.out.println(res);
        if(rus==res){
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }

    }
    
}
