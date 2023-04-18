package PrepInsta_Coding;

public class SumofDigit2 {

    public static void main(String[] args){

        String n = "23543232";
        int sum = 0;

        for(int i = 0;i<n.length();i++){

            sum = sum + n.charAt(i) - 48;
        }
        System.out.println(sum);
    }
    
}
