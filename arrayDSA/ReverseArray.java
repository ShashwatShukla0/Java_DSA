package arrayDSA;

public class ReverseArray {

    public static void main(String args[]){
        int arr[] = {32,54,23,45,43,76,34};
        int n = arr.length;

        revArray(arr,n);
    }

    private static void revArray(int[] arr, int n) {

        int temp[] = new int[n];
        int j = n;
        for(int i =0;i<n;i++){
            temp[j-1] = arr[i];
            j=j-1;

        }
        for(int i=0;i<n;i++){
        System.out.print(temp[i]+" ");
        }
    }
    
}
