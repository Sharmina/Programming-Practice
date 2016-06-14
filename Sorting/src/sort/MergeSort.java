package sort;



public class MergeSort implements Sort {

	@Override
	public void doSort(int[] input) {
		// TODO Auto-generated method stub
		mergeSort(input,0,input.length-1);
		
		
	}
	public void doMerge(int[] input, int start1,int end1,int start2,int end2)
	{
		int length=(end2-start2+1)+(end1-start1+1);
		int[] tempArray=new int[length];
		
		int i=start1;
		int j=start2;
		for(int k=0;k<length;k++)
		{
			if(i>end1)
			{
				while(j<=end2)
					tempArray[k++]=input[j++];
				break;
			}
			if(j>end2)
			{
				while(i<=end1)
					tempArray[k++]=input[i++];
				break;
			}
			
			if(input[i]<input[j])
				tempArray[k]=input[i++];
			else
				tempArray[k]=input[j++];
		}
		i=start1;
		for(int k=0;k<length;k++)
		{
			input[i++]=tempArray[k];
		}
		tempArray=null;
		
	}
	
	public void mergeSort(int[] input, int start, int end){
		if(start==end)
			return;
		int mid=(int) (start+Math.floor((end-start)/2));
		mergeSort(input,start,mid);
		mergeSort(input,mid+1,end);
		doMerge(input,start,mid,mid+1,end);
	}

}
