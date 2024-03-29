package InterviewQ;

public class ReverseString {

     public static void main(String[] args) {
        String str="Hello";

        System.out.println(str);

        System.out.println(reverse(str));
    }

    public static String reverse(String str) {
        if(str==null){
            throw new IllegalArgumentException("Null is not valid");
        }

        StringBuilder out = new StringBuilder();

        char[] ch = str.toCharArray();

        for(int i=str.length()-1;i>=0;i--){
            out.append(ch[i]);
        }

        return out.toString();


    }
}