package stringDSA;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringBuilder str = new StringBuilder();
		
		str.append(sc.nextLine());                 //Taking input from String Builder
		
		for(int i=0;i<str.length()/2;i++) {
			int front = i;
			int back = str.length() - 1 - i;
			
			char frontC = str.charAt(front);
			char backC = str.charAt(back);
			
			str.setCharAt(front,backC);
			str.setCharAt(back, frontC);
		}
		
		System.out.println(str);
		sc.close();
	}
	

}
