package DP;

import java.util.Arrays;

public class KnapSack {

    public static void main(String[] args) {

        int W = 10;  //capacity
        int n = 4;  //no. of items

        int [] v = {20,30,10,50};  //value of item
        int[] w = {1,3,4,6};        //weight of item

        int mat[][] = new int[n+1][W+1];

        //base condition, row and column of first must be 0;
        for(int i=0;i<W+1;i++){
            mat[0][i] = 0;
        }

        for(int i=0;i<n+1;i++){
            mat[i][0] = 0;
        }
        //from row=1 and column=1
        for(int i=1;i<=n;i++){
            for(int j=1;j<=W;j++){

                int max = mat[i-1][j];
                int maxCurr = 0;

                int weightCurr = w[i-1]; //0-3
                if(j>=weightCurr){
                    maxCurr = v[i-1];

                    int rem = j-weightCurr;

                    maxCurr += mat[i-1][rem];
                }

                mat[i][j] = Math.max(max,maxCurr);


            }
        }

        System.out.println(mat[n][W]);

        System.out.println(Arrays.deepToString(mat));
    }
    
}
