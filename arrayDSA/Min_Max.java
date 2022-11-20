package arrayDSA;

import java.util.Scanner;

public class Min_Max {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
					min=arr[i];
				}
		}
		
		System.out.println("Max: "+max+"\n"+"Min: "+min);
		sc.close();
	}

}
