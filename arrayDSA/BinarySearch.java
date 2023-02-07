package arrayDSA;

import java.util.Scanner;

public class BinarySearch {

    public static void Bsearch(int arr[],int start,int last,int key){

        int mid = (start+last)/2;

        while(start<=last){
            if(arr[mid]<key){
            start=mid+1;
            } else
            if(arr[mid]==key){
                System.out.println("Element found at index: "+mid);
                break;
            }
            else {
                last = mid-1;
            }

            mid=(start+last)/2;
        }

        if(start>last){
            System.out.println("Element not found");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter key to search: ");
        int key = sc.nextInt();

        Bsearch(arr,0,n-1,key);

        sc.close();
    
    }

       
}
