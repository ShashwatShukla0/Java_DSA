package stringDSA;

public class OnlyDigits {

    public static void main(String args[]){

        String str="123454";
        boolean abc=true;

        for(int i=0;i<str.length();i++) {
            if(!Character.isDigit(str.charAt(i))){
                abc=false;
                break;
            }
        }

        if(abc){
            System.out.println("COntains only digit");
        }
        else{
            System.out.println("Contains Charatcer also");
        }

    }
    
}
