package chapter5;

public class Problem1 {

	static int updateBits(int n,int m,int i,int j)
	{
		int mask=~(((1<<(j-i))-1)<<i);
		System.out.println(Integer.toString(mask,2));
		return ((n&mask)|(m<<i));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=Integer.parseInt("10000000000", 2);
		int m=Integer.parseInt("10011", 2);
		
		int i=2;
		int j=6;
		
		System.out.println(Integer.toString(updateBits(n,m,i,j), 2));

	}

}
