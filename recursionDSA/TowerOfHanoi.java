package recursionDSA;

import java.util.Scanner;

public class TowerOfHanoi {
	
	public static void towerOfH(int n, String s, String h, String d) {
		
		if(n==1) {
			System.out.println("Transfer disk "+n+"from "+ s+"to "+d);
			return;
		}
		towerOfH(n-1,s,d,h);
		
		System.out.println("Transfer disk "+n+"from "+ s+"to "+h);
		
		towerOfH(n-1,h,s,d);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		towerOfH(n,"A ","B ","C ");
		
		sc.close();

	}

}
