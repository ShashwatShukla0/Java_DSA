package Practise;

public class LeapYear {

    public static void main(String[] args) {

        int n=1900;

        if(n%4==0){
            if(n%100==0){   //if a century is divisible by 100 but not 400 then it is skipped ex-1800,1900 but 2000 us leap year.
                if(n%400==0){
                    System.out.println(("Leap"));
                } else {
                    System.out.println("Not");
                }
            } else{
                System.out.println("Leap");
            }
        }
        else {
            System.out.println("Not leap");
        }
    }
    
}
