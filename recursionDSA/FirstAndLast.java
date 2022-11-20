package recursionDSA;

import java.util.Scanner;

//NOT SOLVED YET, ANSWER COMING WRONG !!!!!!!!!!!!

public class FirstAndLast {
	
	public static int first = -1;
	public static int last = -1;
	
	
	public static void findOccur(String str, int i, char ele) {
		
		if(i==str.length()) {
			
			return;
		}
		
		
		if(str.charAt(i)==ele) {
			if(first==-1) {
				first = i;
			}
			else {
				last = i;
			}
		}
		
		findOccur(str,i+1,ele);
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		String str = sc.nextLine();
		
		findOccur(str,0,'a');
		System.out.println(first);
		System.out.println(last);
		
		sc.close();

	}

}
