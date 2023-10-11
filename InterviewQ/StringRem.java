package InterviewQ;

public class StringRem {


    public static void main(String[] args) {
        String str = "Javauaua";
        int n = str.length();
        char[] str1 = str.toCharArray();
        System.out.println(remDup(str1,n));
    }

    public static char[] remDup(char[] str1,int x) {

        int idx = 0;
        char[] res = new char[x-1];
        for(int i=0;i<x;i++){
            int j;
            for(j=0;j<i;j++) {
                if(str1[i]==str1[j]) {
                    break;
                }
            }
            if(j == i){
                res[idx++] = str1[i];
            }
        }

        return res;
    }
    
}
