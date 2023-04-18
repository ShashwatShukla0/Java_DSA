package PrepInsta_Coding;

public class ArmStrong1 {

    public static void main(String[] args){
         int n=143;
         int temp = n;
         int sum=0,rem,cube;

        while(n>0){
            rem = n%10;
            cube = rem*rem*rem;
            sum += cube;
            n=n/10;
        }

        if(sum==temp){
            System.out.println("Is armstrong");
        } else {
            System.out.println("Not a armstrong");
        }}
    
}
