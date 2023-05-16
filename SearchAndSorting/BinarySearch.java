package SearchAndSorting;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args){

        int arr[] = {23,54,21,65,43,22,75,47,98,54,42,34};
        int target = 43;

        int n = arr.length;

        int first=0,last=n-1;

        Arrays.sort(arr);

        while(first<last){
            int middle = (first+last)/2;

            if(arr[middle] == target){
                System.out.println("Element found at: "+ middle);
            }

            else if(arr[middle]<target){
                first = middle+1;

            }
            else if(arr[middle]>target){
                last = middle-1;
            }
        }
    }
    
}
