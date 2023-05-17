package SearchAndSorting;

public class InsertionSorting {

    public static void main(String[] args){

        int arr[] = {23,54,21,65,43,22,75,47,98,54,42,34};

        int n = arr.length;

        for(int i=1;i<n;i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;

        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }
    
}
