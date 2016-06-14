
public class BubbleSort {

	static int[] bubbleSort(int[] nums)
	{
		for(int i=1;i<nums.length;i++)
		{
			int j=i;
			while(j>0 && (nums[j]<nums[j-1]))
			{
				int tmp=nums[j];
				nums[j]=nums[j-1];
				nums[j-1]=tmp;
				
				j--;
			}
		}
		return nums;
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
		int[] sorted=bubbleSort(nums);
		
		print(sorted);

	}

}
