package Practise;

public class ArrayRotate {

    public static void rotateLeftArray(int arr[],int n,int t) {

        int temp[] = new int[n];
        int k=0;
        for(int i = t;i<n;i++) {
            temp[k] = arr[i];
            k++;
        }

        for(int i=0;i<t;i++){
            temp[k]= arr[i];
            k++;
        }

        System.out.println("Array Left: ");
        for(int i=0;i<n;i++){
            System.out.print(temp[i]+" ");
        }
    }

    public static void rotateRight(int arr[],int n,int d) {

        int temp[] = new int[n];
        int k=0;

        for(int i=d;i<n;i++){
            temp[i] = arr[k];
            k++;
        }
        for(int i=0;i<d;i++){
            temp[i] = arr[k];
            k++;
        }

        System.out.println("Array RIght: ");
        for(int i=0;i<n;i++){
            System.out.print(temp[i]+" ");
        }

    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        int t = 2;

        rotateLeftArray(arr,n,t);
        rotateRight(arr, n, t);
    }
    
}
