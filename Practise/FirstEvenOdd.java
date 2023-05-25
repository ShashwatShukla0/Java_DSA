package Practise;

public class FirstEvenOdd {

    public static void main(String[] args){

        int arr[] = {3,2,6,9,7,5,44,8};

        printArr(arr);
    }

    static void printArr(int arr[]){
        int idx = 0;
        int n = arr.length;
        int a[] = new int[n];
        
        for(int i=0;i<n;i++) {
            if(arr[i]%2==0){
                a[idx] = arr[i];
                idx++;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2 !=0){
                a[idx] = arr[i];
                idx++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]+" ");
        }

    }
    
}
