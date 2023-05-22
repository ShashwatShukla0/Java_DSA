package Practise;

public class FactorsNum {

    public static void main(String[] args) {
        
        int n=60;
        int mid = n/2;
        System.out.println("Factors are: ");
        for(int i=1;i<=mid;i++){
            if(n%i==0){
                System.out.print(i +" ");
            }
        }
    }
    
}
