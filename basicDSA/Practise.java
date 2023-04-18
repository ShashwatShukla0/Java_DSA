import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

class Practise{
    
    public static void main(String[] args){
        String s1 = "James";
        StringBuilder s2 = new StringBuilder("James");
        StringBuffer s3 = new StringBuffer("James");

        System.out.println(s1==s2.toString());
        System.out.println(s1==s3.toString());
    }
}