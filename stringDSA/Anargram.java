package stringDSA;

import java.util.Arrays;

public class Anargram {

    public static boolean isAnagram(char[] ch1,char[] ch2){

        int a = ch1.length;
        int b = ch2.length;

        if(a!=b) {
            return false;
        }

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for(int i=0;i<a;i++){
            if(ch1[i]!=ch2[i]){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {

        String str1="Gram",str2="Gmra";

        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();

        if(isAnagram(ch1,ch2)){
            System.out.println("Is anagram");
        } else {
            System.out.println("Not a anagram");
        }
    }
    
}
