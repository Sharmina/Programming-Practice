
public class QuickSort {

	static int partition(int[] nums,int start,int end)
	{
		int pivot=nums[start];
		
		int i=start+1;
		int j=start+1;
		while(j<=end)
		{
			if(nums[j]<pivot)
			{
				int temp=nums[j];
				nums[j]=nums[i];
				nums[i]=temp;
				i++;
			}
			j++;
		}
		int temp=nums[i-1];
		nums[i-1]=nums[start];
		nums[start]=temp;;
		
		return i-1;
	}
	static void DoQuickSort(int[] nums, int start,int end)
	{
		if(start>=end)
			return;
		int index=partition(nums,start,end);
		DoQuickSort(nums,start,index-1);
		DoQuickSort(nums,index+1,end);
	}
	static void print(int[] nums)
	{
		for(int i=0;i<nums.length;i++)
			System.out.print(nums[i]+" ");
		System.out.print("\n");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,3,7,2,5,9};
		DoQuickSort(nums,0,nums.length-1);
		print(nums);
	}

}
