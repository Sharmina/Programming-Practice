package chapter9;

public class Problem3 {

	static int magicIndex(int[] nums,int start,int end)
	{
		if(start>end)
			return -1;
		
		int mid=(int) Math.floor((start+end)/2);
		if(nums[mid]==mid)
			return mid;	
		
		if(nums[mid]>mid)
		{
			return magicIndex(nums,start,mid-1);
		}
		else
			return magicIndex(nums,mid+1,end);
		
	}
	static int magicIndexDuplicate(int[] nums,int start,int end)
	{
		if(start>end)
				return -1;
		int mid=(int) Math.floor((start+end)/2);
		if(nums[mid]==mid)
			return mid;
		
		int leftIndex=Math.min(mid-1,nums[mid]);
		int index=magicIndexDuplicate(nums,start,leftIndex);
		if(index!=-1)
			return index;
		
		int rightIndex=Math.max(mid+1,nums[mid]);
		index=magicIndexDuplicate(nums,rightIndex,end);
			return index;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={-2,-1,2,10,15,16,18,19};
		
		System.out.println(magicIndex(nums,0,nums.length-1));
		int[] nums2={-1,-1,3,10,10,10,10,11,11,11,11,11,11};
		System.out.println(magicIndexDuplicate(nums2,0,nums2.length-1));
	}

}
