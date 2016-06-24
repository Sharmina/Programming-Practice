package chapter9;

import java.util.Arrays;

public class Problem1 {
	
	public static int countWaysDP(int n,int[] a)
	{
		if(n<0)
			return 0;
		if(n==0)
		{	a[0]=1;
			return 1;
		}
		if(a[n]>-1)
			return a[n];
		
		else
		{
			a[n]=countWaysDP(n-1,a)+countWaysDP(n-2,a)+countWaysDP(n-3,a);
			return a[n];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a=new int[5];
		Arrays.fill(a,-1);
		System.out.println(countWaysDP(4,a));
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
