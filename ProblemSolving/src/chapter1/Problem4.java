package chapter1;

public class Problem4 {

	static void replaceString(char[] array,int length)
	{
		int spaceCount=0;
		int newLength;
		for(int i=0;i<length;i++)
		{
			if(array[i]==' ')
				spaceCount++;
		}
		newLength=length+2*spaceCount;
		array[newLength]='\0';
		for(int i=length-1;i>=0;i--)
		{
			if(array[i]==' ')
			{
				array[newLength-1]='0';
				array[newLength-2]='2';
				array[newLength-3]='%';
				newLength=newLength-3;
			}
			else
			{
				array[newLength-1]=array[i];
				newLength=newLength-1;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method s
		String str="Hello Mr Smith";
		char[] charArray=str.toCharArray();
		
		char[] array=new char[100];
		
		for(int i=0;i<str.length();i++)
		{
			array[i]=charArray[i];
		}
		System.out.println(array);
		replaceString(array,str.length());
		System.out.println(array);
		
	}

}
