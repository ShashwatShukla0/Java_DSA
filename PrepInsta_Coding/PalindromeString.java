package PrepInsta_Coding;

public class PalindromeString {

    public static void main(String[] args){

        String str = "abbc";
        String rev="";
        char c;

        for(int i=0;i<str.length();i++){
            c = str.charAt(i);
            rev = c+rev;
        }
        System.out.println(rev);

        if(rev.equals(str)){
            System.out.println("Is Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
    
}
