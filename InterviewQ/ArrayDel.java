package InterviewQ;

public class ArrayDel {

    public static void main(String[] args) {

        int arr [] = {1,2,3,4,5};
        int del = 3;
        
        int []res = remEle(arr, del);
        for(int i=0;i<res.length;i++) {
            System.out.println(res[i]);
        }

    }

    public static int[] remEle(int arr[],int del) {
        int n = arr.length;
        int newArr[] = new int[n-1];
        int idx=0;
        for(int i=0;i<n;i++) {
            if(arr[i]!=del) {
                newArr[idx] = arr[i];
                idx++;
            }
        }

        return newArr;
    }
    
}
