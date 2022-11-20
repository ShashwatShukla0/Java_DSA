package backtrackingDSA;

import java.util.Scanner;

public class Merge_Sort {
	
	public static void conqueror(int arr[], int si, int mid, int ei) {
		
		int merged[] = new int[ei-si+1];
		
		int idx1 = si;
		int idx2 = mid+1;
		int x=0;
		
		while(idx1<=mid && idx2<=ei) {
			if(arr[idx1]<=arr[idx2]) {
				merged[x++] = arr[idx1++];
			} else {
				merged[x++] = arr[idx2++];
			}
		}
		
		while(idx1<= mid) {
			merged[x++] = arr[idx1++];
		}
		while(idx2<= ei) {
			merged[x++] = arr[idx2++];
		}
		
		for(int i=0, j=si; i<merged.length;i++,j++) {
			arr[j] = merged[i];
		}
		
	}
	
	public static void divide(int arr[], int si, int ei) {
		if(si>=ei) {
			return;
		}
		
		int mid = si+(ei-si)/2;
		divide(arr,si,mid);
		divide(arr,mid+1,ei);
		
		conqueror(arr,si,mid,ei);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		
		divide(arr,0,n-1);
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+ "  ");
		}
		System.out.println();
		
		
		sc.close();
	}

}
