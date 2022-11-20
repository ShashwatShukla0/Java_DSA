package recursionDSA;

import java.util.Scanner;

public class IfArrayAsc {
	
	public static boolean arrayAsc(int arr[], int size) {
		if(size==arr.length-1) {
			return true;
		}
		
		if(!arrayAsc(arr,size+1)) {
			return false;
		}
		
		return arr[size] < arr[size+1];
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		if(arrayAsc(arr,0)) {
			System.out.println("Strictly increasing");
		}else {
			System.out.println("Decreasing");
		}
		
		sc.close();

	}

}
