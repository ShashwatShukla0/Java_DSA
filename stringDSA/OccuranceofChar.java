package stringDSA;

public class OccuranceofChar {

    public static void main(String args[]) {
        String str = "Transformersis";
        char c= 's';

        int count=0;
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)==c){
                count++;
            }
        }
        System.out.println("Total occurance: "+count);
    }
    
}
