package PrepInsta_Coding;

import java.util.Scanner;

public class PositiveNegative1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n>0){
            System.out.println("Postive");

        }else if(n==0){
            System.out.println("Zero");
        } else {
            System.out.println("Negative");
        }
        sc.close();
    }
    
}
