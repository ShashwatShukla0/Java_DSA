package PrepInsta_Coding;

import java.util.Scanner;

public class PositiveNegative2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n==0){
            System.out.println("Zero");
        } else{
            String res = n>0 ? "Positive":"Negative";
            System.out.println(res);
        }
        sc.close();
    }
    
}
