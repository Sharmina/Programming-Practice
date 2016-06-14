package chapter11;

public class Problem1 {

	static void merge2Array(int[] a,int[] b,int indexA,int indexB)
	{
		int i=indexA;
		int j=indexB;
		int k=indexA+indexB+1;
		
		while(i>=0 && j>=0)
		{
			if(a[i]>b[j])
			{
				a[k]=a[i];
				i--;
			}
			else
			{
				a[k]=b[j];
				j--;
			}
			k--;
		}
		while(j>=0)
		{
			a[k]=b[j];
			j--;
			k--;
		}
	}
	static void printArray(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={5,7,9,10,0,0,0};
		int[] b={2,12,13};
		
		
		merge2Array(a,b,3,2);
		
		printArray(a);

	}

}
