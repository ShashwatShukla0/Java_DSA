package recursionDSA;

import java.util.Scanner;

public class SquareN {
	public static int squareN(int n, int x) {
		
		if(n==0) {
			return 1;
		}
		if(x==0) {
			return 0;
		}
		int x_=squareN(n-1,x);
		int xn=x*x_;
		return xn;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		System.out.print(squareN(n,x));
		sc.close();

	}

}
