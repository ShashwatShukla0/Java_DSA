package arrayDSA;

import java.util.Arrays;

public class MissingNum {


    public static void main(String args[]) {
        int arr[] = {2,4,6,7,5,8,43,56,76,78,32,21,56,87,79};
        System.out.println("Given array: ");
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("Missing digits between 1 to 100: ");

        display(arr);
    }

    public static void display(int arr[]){
        int j=0;
        for(int i=1;i<=100;i++){
            if(i==arr[j]){
                j++;
            }
            else {
                System.out.print(i+" ");
            }
        }
    }
    
}
