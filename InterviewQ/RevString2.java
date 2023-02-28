package InterviewQ;

public class RevString2 {

    public static void main(String args[]) {

        String ch="Hello", temp="";
        char str;

        for(int i=0;i<ch.length();i++){

            str = ch.charAt(i);
            temp = str+temp;
        }
        System.out.println(temp);
    }
    
}
