package chapter1;

public class Problem3 {
	
	static boolean isPermutation(String s1,String s2)
	{
		if(s1.length()!=s2.length())
			return false;
		char[] s1_array=s1.toCharArray();
		char[] s2_array=s2.toCharArray();
		
		int[] array=new int[256];
		
		for(int i=0;i<s1_array.length;i++)
		{
			array[s1_array[i]]++;
		}
		for(int i=0;i<s2_array.length;i++)
		{
			int index=(int)s2_array[i];
			array[index]--;
			
			if(array[index]<0)
				return false;
			
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPermutation("abc ","adcb"));
		System.out.println(isPermutation("",""));
		System.out.println(isPermutation("abc ","a cb"));
		
	}

}
