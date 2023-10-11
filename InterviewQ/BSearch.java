package InterviewQ;

import java.util.Arrays;

public class BSearch {

    public static int BinSearch(int arr[],int x) {
        int s=0,e = arr.length;
        while(s<=e) {
            int m = (s+e)/2;

            if(arr[m] == x) {
                return 1;
            } else if(arr[m]<x){
                s = m+1;
            } else {
                e = m-1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {3,6,2,87,43,23,65,98,8,65,6};
        int x = 65;
        Arrays.sort(arr);
        int count = BinSearch(arr,x);

        if(count == 1) {
            System.out.println("Element found");
        } else {
            System.out.println("No Such element");
        }
    }
    
}
