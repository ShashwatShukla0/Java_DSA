package stringDSA;

public class StringSwap {

    public static void main(String args[]){

        String a="Hello",b="World";

        System.out.println("Before swap A: "+a+" B: "+b);

        a = a+b;
        b = a.substring(0, a.length()-b.length());
        a = a.substring(b.length());

        System.out.println("After swap A: "+a+" B: "+b);
    }
    
}
