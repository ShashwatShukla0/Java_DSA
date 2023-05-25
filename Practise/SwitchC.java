package Practise;

import java.util.Scanner;

public class SwitchC {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 number");
        int a=sc.nextInt();
        int b = sc.nextInt();
        
        int res=0;

        System.out.println("Press 1 to multiply, 2 to divide and 3 to substract");
        int i = sc.nextInt();

        switch(i) {
            case 1: res = a*b;
                    System.out.println("Multiply: "+res);
                    break;
            case 2: res = a/b;
                    System.out.println("Divide: "+res);
                    break;
            case 3: res = a-b;
                    System.out.println("Subs: "+res);
                    break;
            default: res = a+b;
                    System.out.println("Sum is default: "+ res);
        } 

        sc.close();
    }
    
}
