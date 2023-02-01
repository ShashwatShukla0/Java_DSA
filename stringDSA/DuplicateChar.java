package stringDSA;

public class DuplicateChar {

    public static void main(String[] args) {

        String str="Hello, this is a string";

        int count;

        char strr[] = str.toCharArray();

        System.out.println("Duplicate characters in String are: ");

        for(int i=0;i<strr.length;i++) {
            count=1;
            for(int j=i+1;j<strr.length;j++) {
                if(strr[i]==strr[j] && strr[i]!=' '){
                    count++;

                    strr[j]='0';
                }
            }

            if(count>1 && strr[i]!='0'){
                System.out.println(strr[i]);
            }
        }
    }
    
}
