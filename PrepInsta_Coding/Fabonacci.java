package PrepInsta_Coding;

public class Fabonacci {

    public static void main(String[] args){

        int n=23;
        int a=0,b=1,c;

        System.out.print(a+" "+b);
        for(int i=2;i<n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(" "+c+" ");
        }
    }
    
}
