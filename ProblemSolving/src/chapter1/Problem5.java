package chapter1;

public class Problem5 {

	static String compressString(String str)
	{
		if(str.length()==0 || str.length()==1)
			return str;
		
		StringBuffer sb=new StringBuffer();
		
		char last=str.charAt(0);
		int count=1;
		for(int i=1;i<str.length();i++)
		{
			if(last==str.charAt(i))
			{
				count++;
			}
			else
			{
				sb.append(last);
				sb.append(count);
				last=str.charAt(i);
				count=1;
				
			}
		}
		sb.append(last);
		sb.append(count);
		
		String out=sb.toString();
		if(out.length()<=str.length())
			return out;
		else
			return str;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(compressString("aaaabbca"));
		System.out.println(compressString("abca"));
	}

}
