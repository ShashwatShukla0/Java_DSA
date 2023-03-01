package InterviewQ;

public class DuplicateSorted {

    public static void main(String args[]){

        int arr[] = {1,1,2,2,2};

       removeDup(arr,arr.length);

       for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
       }
       

    }

    private static int removeDup(int[] arr, int n) {

        if(n==0 || n==1) {
            return n;
        }

        int temp[] = new int[n];
        int j=0;

        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                temp[j++] = arr[i];
            }
        }

        temp[j++] = arr[n-1];

        for(int i=0;i<n;i++){
            arr[i] = temp[i];
        }
        return j;
    }

}
