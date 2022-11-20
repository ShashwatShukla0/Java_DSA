package recursionDSA;

import java.util.Scanner;

public class DuplicateInString {
	
	public static boolean map[] = new boolean[26];
	
	public static void duplicateString(String str, int i, String newS) {
		
		if(i==str.length()) {
			System.out.print(newS);
			return;
		}
		
		char curr = str.charAt(i);
		if(map[curr-'a']) {
			duplicateString(str,i+1,newS);
		}else
		{
			newS += curr;
			map[curr-'a'] = true;
			duplicateString(str,i+1,newS);
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		String str = sc.nextLine();
		
		duplicateString(str,0,"");
		
		sc.close();

	}

}
