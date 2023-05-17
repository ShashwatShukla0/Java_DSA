package SearchAndSorting;

public class BubbleSort {

    public static void main(String[] args) {

        int arr[] = {23,54,21,65,43,22,75,47,98,54,42,34};

        int n = arr.length;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
    
}
