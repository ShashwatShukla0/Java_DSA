package recursionDSA;

import java.util.Scanner;

public class Subsequences {
	
	public static void subString(String str, int i, String newS) {
		
		if(i==str.length()){
			System.out.println(newS);
			return;
		}
		char curr = str.charAt(i);
		
		subString(str,i+1,newS+curr);    //TO BE
		
		subString(str,i+1,newS);         //NOT TO BE
	}

	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		
		String str = sc.nextLine();
		
		subString(str,0,"");
		sc.close();

	}

}
