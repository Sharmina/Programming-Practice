package chapter11;

public class Problem3 {
	
	static int rotatedBinary(int[] nums,int start, int end,int target)
	{
		if(start>end)
			return -1;
		
		int mid=(int)Math.floor((start+end)/2);
		
		if(nums[mid]==target)
			return mid;
		
		if(nums[start]<nums[mid])
		{
			if(target>=nums[start] && target<nums[mid])
			{
				return rotatedBinary(nums,start,mid-1,target);
			}
			else
			{
				return rotatedBinary(nums,mid+1,end,target);
			}
		}
		else if(nums[mid]<nums[end])
		{
			if(target>nums[mid] && target<=nums[end])
			{
				return rotatedBinary(nums,mid+1,end,target);
			}
			else
			{
				return rotatedBinary(nums,start,mid-1,target);
			}
		}
		else if(nums[mid]==nums[start])
		{
			if(nums[mid]!=nums[end])
			{
				return rotatedBinary(nums,mid+1,end,target);
			}
			else
			{
				int result=rotatedBinary(nums,start,mid-1,target);
				if(result==-1)
					return rotatedBinary(nums,mid+1,end,target);
				else
					return result;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={10,15,20,0,5};
		System.out.println(rotatedBinary(nums,0,nums.length-1,0));
	}

}
