import java.util.Arrays;

public class MergeSort {

	static void merge(int[] nums,int start, int mid, int end)
	{
		int i=start;
		int j=mid+1;
		int length=end-start+1;
		int[] tmp=new int[length];
		for(int l=0,k=start;l<length;l++,k++)
		{
			tmp[l]=nums[k];
		}
		i=0;
		mid=mid-start;
		j=j-start;
		end=end-start;
		int k=start;
		while(i<=mid && j<=end )
		{ 
			if(tmp[i]<tmp[j])
			{
				nums[k++]=tmp[i];
				i++;
			}
			else
			{
				nums[k++]=tmp[j];
				j++;
			}
			
			
		}
		while(i<=mid)
		{
			nums[k]=tmp[i];
			k++;
			i++;
		}
		
		
	}
	static void print(int[] nums)
	{
		for(int i=0;i<nums.length;i++)
			System.out.print(nums[i]+" ");
		System.out.print("\n");
	}
	static void doMergeSort(int[] num, int start, int end)
	{
		if(start>=end)
			return;
		int mid=(int)Math.floor((start+end)/2);
		System.out.println(start+" "+mid+" "+end);
		doMergeSort(num,start,mid);
		doMergeSort(num,mid+1,end);
		merge(num,start,mid,end);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={7,8,4,2,1,10,5};
		doMergeSort(nums,0,nums.length-1);
		print(nums);
	}

}
