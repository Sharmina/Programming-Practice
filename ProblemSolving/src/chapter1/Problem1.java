package chapter1;

public class Problem1 {

	public static boolean hasUniqueChars(String s)
	{
		if(s.length()>256)
			return false;
		boolean[] charSet=new boolean[256];
		
		for(int i=0;i<s.length();i++)
		{
			int index=s.charAt(i);
			if(charSet[index])
				return false;
			else
				charSet[index]=true;
		}
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(hasUniqueChars("aacd"));
		System.out.println(hasUniqueChars("acd"));
		
	}

}
