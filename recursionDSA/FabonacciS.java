package recursionDSA;

import java.util.Scanner;

public class FabonacciS {
	
	public static void fabS(int a, int b, int n) {
		if(n==0) {
			return;
		}
		
		System.out.print(a+" ");
		fabS(b,a+b,n-1);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,b=1;
	
		fabS(a,b,n);
		sc.close();
	}

}
