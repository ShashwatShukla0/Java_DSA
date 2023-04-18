package PrepInsta_Coding;

public class SumofDigit {

    public static void main(String[] args){
        int n = 5632;
        int sum = 0;

        while(n>0){
            sum += n%10;
            n = n/10;
        }

        System.out.println(sum);

    }
    
}
