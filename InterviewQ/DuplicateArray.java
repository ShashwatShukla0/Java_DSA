package InterviewQ;

import java.util.Scanner;

public class DuplicateArray {

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        arr = duplicateArr(arr);

        for(int i=0;i<n;i++) {
            System.out.println(" "+arr[i]);
        }

    }

    private static int[] duplicateArr(int[] a) {
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    a = deleteEle(a,j);
                }
            }
        }
        return a;
    }

    private static int[] deleteEle(int[] a, int j) {
        if(j<0 || j>a.length){
            System.out.println("Array out of bound ");
        }
        int res[]= new int[a.length-1];

        for(int i=0;i<res.length;i++) {
            if(i<j){
                res[i]= a[i];
            }
            else
            {
                res[i]= a[i+1];
            }
        }
        return res;

    }
    
}
