package PrepInsta_Coding;

public class PrimeNo1 {

    public static void main(String[] args){

        int n=37;
        int mid = n/2;
        int flag = 0;

        if(n==0 || n==1){
           System.out.println("Not a prime number");
        }
        if(n==2){
            System.out.println("Is a prime");
        }
        if(n%2==0){
        System.out.println("Not a prime number");
        flag=1;
        }
        else  {
            for(int i=2;i<mid;i++){
                if(n%i==0){
                    System.out.println("Not a prime number");
                    flag =1;
                } 
            }
        }

        if(flag==0) {
            System.out.println("Is a prime number");
        } 
    }
    
}
