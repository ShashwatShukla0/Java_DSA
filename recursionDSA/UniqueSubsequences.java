package recursionDSA;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueSubsequences {
	
	
	public static void subStringU(String str, int i, String newS, HashSet<String> set) {
		
		if(i==str.length()){
			if(set.contains(newS)) {
				return;
			}else
			{
				System.out.println(newS);
				set.add(newS);
				return;
			}
			
		}
		char curr = str.charAt(i);
		
		subStringU(str,i+1,newS+curr,set);    //TO BE
		
		subStringU(str,i+1,newS,set);         //NOT TO BE
	}


	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		
		String str = sc.nextLine();
		HashSet<String> set = new HashSet<>();
		
		subStringU(str,0,"",set);
		sc.close();

	}

}
