package InterviewQ;

public class EvenWord {

    public static void main(String[] args) {

        String str= "Hell Word toh Worlddd";

        for(String s : str.split(" ")){
            if(s.length()%2==0){
                System.out.println(s);
            }
        }
    }
    
}
