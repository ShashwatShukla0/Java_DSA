package InterviewQ;

import java.util.Scanner;

public class Palindrone {

    public static void main(String args[]) {

        String org, rep="";
        Scanner sc = new Scanner(System.in);

        org = sc.nextLine();
        int len = org.length();
        for(int i=len-1;i>=0;i--) {
            rep = rep+org.charAt(i);
        }

        if(org.equals(rep)){
            System.out.println("Is a Palindrone");
        }
        else{
            System.out.println("Not a Palindrone");
        }

        sc.close();
        

    }
    
}
