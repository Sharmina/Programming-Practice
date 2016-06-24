package chapter11;

public class Problem5 {

	static int binarySearchR(String[] strings,int start,int end,String target)
	{
		if(start>end)
			return -1;
		int mid=(int)Math.floor((start+end)/2);
		
		if(strings[mid].isEmpty())
		{
			int left=mid-1;
			int right=mid+1;
			
			while(true)
			{
				if(left<start && right>end)
					return -1;
				
				else if(left>=start && !strings[left].isEmpty())
				{
					mid=left;
					break;
				}
				else if(right<=end && !strings[right].isEmpty())
				{
					mid=right;
					break;
				}
				left--;
				right++;
				
			}
		}
		if(strings[mid].equals(target))
			return mid;
		else if(strings[mid].compareTo(target)<0)
		{
			return binarySearchR(strings,mid+1,end,target);
		}
		else
		{
			return binarySearchR(strings,start,mid-1,target);
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs={"test","","your","","patience"};
		System.out.println(binarySearchR(strs,0,strs.length-1,"your"));
	}

}
