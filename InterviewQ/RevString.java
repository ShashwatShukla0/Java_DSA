package InterviewQ;

public class RevString {

    public static void main(String[] args) {
        String str = "Hello World";
        String temp="";

        int n = str.length();

        for(int i=0;i<n;i++) {
            char ch = str.charAt(i);
            temp = ch + temp;
        }

        System.out.print(temp);
    }
    
}
