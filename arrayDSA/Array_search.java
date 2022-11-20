package arrayDSA;

import java.util.Scanner;

public class Array_search {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
			
		}
		System.out.println("Enter Number to be seacrhed");
		int num=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i]==num) {
				System.out.println("The position is "+i);
			}
		}
		sc.close();
	}

}
