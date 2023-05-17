package SearchAndSorting;

public class QuickSort {

    static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int part(int arr[], int start,int end){

        int pivot = arr[end];
        
        int i = (start-1);

        for(int j= start;j<end;j++){
            if(arr[j]>pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr,i+1,end);
        return i+1;
    }

    static void quickSort(int arr[],int start,int end){

        if(start<end){
            int pi = part(arr, start, end);

            quickSort(arr, start, pi-1);
            quickSort(arr, pi+1, end);
        }
    }

    public static void main(String[] args) {

        int arr[] = {23,54,21,65,43,22,75,47,98,54,42,34};

        int n = arr.length;

        quickSort(arr,0,n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    
}
