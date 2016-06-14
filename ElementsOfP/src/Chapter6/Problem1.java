package Chapter6;

public class Problem1 {

	static void swap(char[] colors,int i,int j)
	{
		System.out.println("swapping"+colors[i]+" "+colors[j]+" ");
		char temp=colors[i];
		colors[i]=colors[j];
		colors[j]=temp;
	}
	static void dutchFlagPartition(char[] colors,char pivot)
	{
		int lessOffset=0;
		int i=0;
		int moreOffset=colors.length-1;
		while(i<=moreOffset)
		{
			if(colors[i]<pivot)
			{
				swap(colors,lessOffset,i);
				lessOffset++;
				i++;
			}
			
			else if(colors[i]>pivot)
			{
				swap(colors,moreOffset,i);
				moreOffset--;
			}
			else if(colors[i]==pivot)
			{
				i++;
			}
		}
	}
	static void print(char[] nums)
	{
		for(int i=0;i<nums.length;i++)
		{
			System.out.print(nums[i]+" ");
		}
		System.out.println();	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char []colors={'C','C','R','Y','R','Y','C','R'};
		print(colors);
		dutchFlagPartition(colors,'R');
		print(colors);

	}

}
