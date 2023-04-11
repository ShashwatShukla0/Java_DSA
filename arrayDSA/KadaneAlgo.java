package arrayDSA;

public class KadaneAlgo {

    public static int maxSub(int arr[],int n){
        int max= Integer.MIN_VALUE;
        int max_end = 0;
        int i;
        for(i=0; i<n; i++){
            max_end = max_end+arr[i];
            if(max<max_end){
                max = max_end;
            }
            if(max_end<0){
                max_end = 0;
            }
            return max;
        }
        return 0;
    }

    public static void main(String[] args){

        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int n = arr.length;
        System.out.println(maxSub(arr,n));
    }
    
}
