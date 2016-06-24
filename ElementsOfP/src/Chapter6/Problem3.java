package Chapter6;

public class Problem3 {

	

	private static int[] multiply(int[] nums1,int[] nums2)
	{
		int[] result=new int[nums1.length+nums2.length];
		
		
		for(int j=nums2.length-1;j>=0;j--)
		{
			for(int i=nums1.length-1;i>=0;i--)
			{
				result[i+j+1]=result[i+j+1]+nums1[i]*nums2[j];
				result[i+j]=result[i+j]+result[i+j+1]/10;
				result[i+j+1]=result[i+j+1]%10;
			}
		}
		
		return result;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1={1,2,3,4};
		int[] nums2={2,1};
		int[] result=multiply(nums1,nums2);
		for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i]);
		}
	}

}
