package basicDSA;

import java.util.Scanner;

public class Factorial {
	
	public static void fact(int n) {
		
		int factorial=1;
		if(n<0) {
			System.out.println("Invalid input");
			return;
		}
		for(int i=n;i>=1;i--) {
			factorial = factorial*i;
		}
		System.out.println(factorial);
		return;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		fact(n);
		sc.close();

	}

}
