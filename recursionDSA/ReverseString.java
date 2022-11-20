package recursionDSA;

import java.util.Scanner;

public class ReverseString {
	
	public static String revS(String str) {
		if(str.length()==1) {
			return str;
		}
		
		char curr = str.charAt(0);
		String next = revS(str.substring(1));
		
		return next+curr;
		
	}

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.print(revS(str));
		
		sc.close();
	}

}
