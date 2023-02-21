package InterviewQ;

import java.util.Scanner;

public class ArmStrong {

    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
    
        int org, rem, res=0;

        org=n;

        while(org!=0){
            rem = org%10;
            res += Math.pow(rem, 3);
            org /= 10;
        }

        System.out.println("Original num: "+ n);
        System.out.println("Armstrong: "+ res);

        if(n==res){
            System.out.println("Is a armstrong");
        }
        else{
            System.out.println("Is not a armstrong");
        }

        sc.close();
    }
    
}
