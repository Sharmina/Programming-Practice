package Chapter7;
/*
 * Interconvert strings and integers
 */
public class Problem1 {

	static String intToString(int num)
	{
		if(num==0)
			return new String("0");
		boolean isNegative=false;
		if(num<0)
		{
			isNegative=true;
			num=num*(-1);
		}
		StringBuffer sb=new StringBuffer();
		
		
		while(num>0)
		{
			sb.insert(0,num%10);
			num=num/10;
		}
		if(isNegative)
			sb.insert(0,"-");
		
		return sb.toString();
	}
	static int stringToInteger(String num)
	{
		boolean isNegative=false;
		if(num.charAt(0)=='-')
		{
			isNegative=true;
			num=num.substring(1);
		}
		if(num.charAt(0)=='+')
		{
			num=num.substring(1);
		}
		int result=0;
		int multiplier=1;
		for(int i=num.length()-1;i>=0;i--)
		{
			result=result+(num.charAt(i)-'0')*multiplier;
			multiplier*=10;
		}
		
		if(isNegative)
			return result*(-1);
		else
			return result;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(intToString(0));
		System.out.println(intToString(123));
		System.out.println(intToString(-123));
		System.out.println("____________________________");
		System.out.println(stringToInteger("-123"));
		System.out.println(stringToInteger("0"));
		System.out.println(stringToInteger("+123"));
		System.out.println(stringToInteger("123"));
		
	}

}
