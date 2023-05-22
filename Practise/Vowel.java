package Practise;

public class Vowel {

    public static void main(String[] args) {

        String str = "Hello World";
        str = str.toLowerCase();
        int n = str.length();
        int c=0,v=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                v++;
            } else if(str.charAt(i)==' '){
            } else{
                c++;
            }
        }

        System.out.println("Total Vowels: "+v);
        System.out.println("Total Constant: "+c);
    }
    
}
