package PrepInsta_Coding;

public class Palindrome1 {

  public static void main(String[] args){
    int n =12021;
    int rev = 0, rem;
    int temp = n;
    while(n>0){
        rem = n%10;
        rev = rev*10 + rem;
        n = n/10;
    }
    System.out.println(rev);
    if(temp == rev){
        System.out.println("Is Palindrome");
    } else {
        System.out.println("Is not Palindrome");
    }
  }

    
}
