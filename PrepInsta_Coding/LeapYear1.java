package PrepInsta_Coding;

public class LeapYear1 {

    public static void main(String[] args){
        int n=2020;

        if((n%400==0) || (n%4==0 && n%100 !=0)){
            System.out.println("Leap year");
        } else
        {
            System.out.println("Not a leap Year");
        }
    }
    
}
