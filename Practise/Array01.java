package Practise;

public class Array01 {

    public static void main(String[] args) {

        int arr[] = {0,1,1,1,0,0,0,1,0,0,1,0};
        int n = arr.length;

        int s = 0, e = n-1;

        while(s<e){
            while(arr[s]==0 && s<e){
                s++;
            }

            while(arr[e]==1 && s<e){
                e--;
            }

            if(s<e){
                arr[s] = 0;
                arr[e] = 1;
                s++;
                e--;
            }
        }

        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
    
}
