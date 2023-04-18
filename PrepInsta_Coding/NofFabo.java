package PrepInsta_Coding;

public class NofFabo {

    public static void main(String[] args){

        int n=23;
        int a=0,b=1,c=0;
        for(int i=2;i<n;i++){
            c=a+b;
            a=b;
            b=c;
        }

        System.out.println(c);
    }
    
}
