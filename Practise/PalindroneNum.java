package Practise;

public class PalindroneNum {

    public static void main(String[] args){

        // int n = 1881,sum=0;
        // while(n>0){
        //     int rem = n%10;
        //     sum = (sum*10)+rem;
        //     n = n/10;
        // }

        // System.out.println(sum);

        String str = "1881g",temp="";
        int n= str.length();

        for(int i=0;i<n;i++) {
            char c = str.charAt(i);
            temp = c + temp;
        }

        System.out.println(temp);
    }
    
}
