package Practise;

public class Armstrong {

    public static void main(String[] args) {
        int n = 143,sum=0;

    while(n>0){
        int rem = n%10;
        sum += rem*rem*rem;
        n = n/10;
    }

    System.out.println(sum);
    }
    
}
