package practice;

public class checkSubstring {

	private static boolean isSubstring(String main,String substr)
	{
		if(main.length()<substr.length())
			return false;
		
		int N=main.length();
		int m=substr.length();
		for(int i=0;i<N-m+1;i++)
		{
			int j=i;
			for(;j<i+m;j++)
			{
				if(main.charAt(j)!=substr.charAt(j-i))
					break;
			}
			if(j==i+m)
				return true;
		}
		
		return false;
	}
	private static boolean check(String main,String substr,int index)
	{
		for(int i=index,j=0;i<substr.length();i++,j++)
		{
			if(main.charAt(i)!=substr.charAt(j))
				return false;
		}
		return true;
	}
	private static boolean isSubstringKLM(String main,String substr)
	{
		if(main.length()<substr.length())
			return false;
		
		int BASE=26;
		int mainHash=0;
		int substrHash=0;
		int PowerS=1;
		int N=main.length();
		int m=substr.length();
		for(int i=0;i<m;i++)
		{
			PowerS=(i>0)?BASE*PowerS:1;
			mainHash=mainHash*BASE+main.charAt(i);
			substrHash=substrHash*BASE+substr.charAt(i);
			
		}
		
		for(int i=m;i<N;i++)
		{
			if(mainHash==substrHash && check(main,substr,i-m))
			{
				return true;
			}
			mainHash=mainHash-PowerS*main.charAt(i-m);
			mainHash=mainHash*BASE+main.charAt(i);
		}
		if(mainHash==substrHash && check(main,substr,N-m))
		{
			return true;
		}
		return false;	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isSubstringKLM("heehaha","ha"));
		System.out.println(isSubstringKLM("heehaha","hae"));

	}

}
