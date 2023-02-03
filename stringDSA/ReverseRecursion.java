package stringDSA;

public class ReverseRecursion {

    public static String Reverse(String str){
        if(str.isEmpty()){
            return str;
        } else {
            return Reverse(str.substring(1))+str.charAt(0);
        }


    }

    public static void main(String args[]) {

        String str = "Hello";

       // char[] ch = str.toCharArray();

        System.out.println(Reverse(str));
        
        
    }
    
}
