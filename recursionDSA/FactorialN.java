package recursionDSA;

import java.util.Scanner;

public class FactorialN {
	
	public static void factN(int n, int prod) {
		if(n==0) {
			System.out.println(prod);
			return;
		}
		prod*=n;
		factN(n-1,prod);
		
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int prod=1;
		factN(n,prod);
		sc.close();
	}

}
