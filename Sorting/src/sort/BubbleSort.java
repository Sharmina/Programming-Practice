package sort;



public class BubbleSort implements Sort{

	
	void swap(int[] input,int i,int j)
	{
		int temp=input[i];
		input[i]=input[j];
		input[j]=temp;
	}
	@Override
	public void doSort(int[] input) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<input.length;i++)
		{
			int j=i; 
			while(j>0 && input[j-1]>input[j])
			{
				swap(input,j-1,j);
				j--;
			}
		}
		
	}

}
