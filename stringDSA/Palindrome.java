package stringDSA;

public class Palindrome {

    public static boolean isPal(String str){
        String rev="";

        boolean ans=false;

        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }

        if(str.equals(rev)){
            return true;
        }
        return ans;
    }

    public static void main(String args[]) {
        String str="abba";
        System.out.println(isPal(str));
    }

}
