package InterviewQ;

public class RevWord {

    public static void main(String[] args) {

        String str = "Hello World";
        String []split = str.split(" ");
        int n=split.length;

        for(int i=n-1;i>=0;i--){
            System.out.println(split[i]);
        }
    }
    
}
