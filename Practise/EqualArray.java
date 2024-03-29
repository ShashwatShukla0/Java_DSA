package Practise;

import java.util.Arrays;

public class EqualArray {

    public static boolean equalArr(int arr1[],int arr2[]){
        int n = arr1.length;
        int m = arr2.length;

        if(n!=m){
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i=0;i<n;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int arr1[] = {1,4,2,5,8,4};
        int arr2[] = {1,4,2,5,8,4};
        boolean ans = equalArr(arr1, arr2);
        if(ans){
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
    
}
