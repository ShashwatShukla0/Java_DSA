package Practise;

public class ReplaceChar {

    public static String replaceString(String str,char c){

        int n = str.length();
        char[] ch = str.toCharArray();
        for(int i=0;i<n;i++){
            if(ch[i]==c){
                ch[i] = '8';
            }
        }
        String ans = new String(ch);

        return ans;
        

    }

    public static void main(String[] args) {

        String str = " Hello, This is a new world";
        char c = 'l';
        
        //str = str.replaceAll("[^a-zA-z0-9]", "");

        System.out.println(replaceString(str,c));
    }
    
}
