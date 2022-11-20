package recursionDSA;

import java.util.Scanner;

public class EndOfString {
	
	public static void moveAllX(String str, int i, int count,String newS) {
		
		if(i==str.length()) {
			for(int j=0;j<count;j++) {
				newS += 'x';
			}
			System.out.print(newS);
			return;
		}
		
		char curr = str.charAt(i);
		if(curr=='x') {
			count++;
			moveAllX(str,i+1,count,newS);
		} else
		{
			newS += curr;
			moveAllX(str,i+1,count,newS);
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		String str = sc.nextLine();
		
		moveAllX(str,0,0,"");
		sc.close();
	}

}
