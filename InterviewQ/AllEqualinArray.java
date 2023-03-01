package InterviewQ;

import java.util.Arrays;
import java.util.Scanner;

public class AllEqualinArray {

    public static void main(String args[]){

    Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0)
		{
		   int n=in.nextInt();
		   int[] a=new int[n];
		   int[] freq=new int[1001];
		   for(int i=0;i<n;i++)
		   {
		       a[i]=in.nextInt();
		      System.out.println(freq[a[i]]++); 
		   }
		   Arrays.sort(freq);
		   //System.out.println(n-freq[1000]);
		}
    }
}
