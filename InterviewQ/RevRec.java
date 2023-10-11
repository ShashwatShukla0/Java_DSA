package InterviewQ;

public class RevRec {

    public static void main(String[] args) {

        String str = "Sandy";
        System.out.println(revRec(str));
    }

    public static String revRec(String str) {

        if(str == null || str.length()<=1){
            return str;
        }

        return revRec(str.substring(1))+ str.charAt(0);
    }
    
}
