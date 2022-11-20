package recursionDSA;

import java.util.Scanner;

public class SumofN {
	
	public static void sumN(int n,int sum) {
		if(n==0) {
			System.out.println(sum);
			return;
		}
		
		sum+=n;
		
		sumN(n-1,sum);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		sumN(n,sum);
		sc.close();
	}

}
