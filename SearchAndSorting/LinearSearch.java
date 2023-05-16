package SearchAndSorting;

public class LinearSearch {

    public static void main(String[] args){

        int arr[] = {23,54,21,65,43,22,75,47,98,54,42,34};
        int target = 43;

        int n = arr.length;

        for(int i=0;i<n;i++){
            if(arr[i]==target){
                System.out.print("Element found at: "+ i);
            }
        }
    }
    
}
