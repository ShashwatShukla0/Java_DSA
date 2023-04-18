package PrepInsta_Coding;

public class LeapYear2 {

   public static void main(String[] args){

    int n=2004;

    String res = (n%400==0) || (n%4==0 && n%100 !=0) ? "Leap Year" : "Not a leap year";

    System.out.println(res);
   }

    
}
