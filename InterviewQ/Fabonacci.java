package InterviewQ;

public class Fabonacci {
    
    public static void printF(int count) {
        int a=0;
        int b=1;
        int c=1;

        for(int i=1;i<count;i++){
            
        a=b;
        b=c;
        c=a+b;
        }

        System.out.println(a+" ");
    }

    public static void main(String[] args){
        int count=7;

        printF(count);
    }
}
