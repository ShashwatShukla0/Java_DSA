package DP;

import java.util.Arrays;

public class CoinChange {

    public static void main(String[] args) {

        int n = 18;
        int arr[] = {1,5,7};

        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);

        int ans = coinDp(n,arr,dp);
        System.out.println(ans);

        for(int x:dp){
            System.out.print(x+" ");
        }
    }

    public static int coinDp(int n, int arr[],int dp[]){

        if(n==0){
            return 0;
        }

        int ans = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(n-arr[i] >= 0 ){
                int sub = 0;
                if(dp[n-arr[i]] != -1){
                    sub = dp[n-arr[i]];
                } else {
                    sub = coinDp(n-arr[i], arr,dp);
                }

                if(sub != Integer.MAX_VALUE && sub+1<ans){
                    ans = sub+1;
                }
            }
        }

        return dp[n] = ans;
    
    }

    
}
