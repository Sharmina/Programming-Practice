package chapter5;

public class Problem2 {
	
	static String convert2Binary(double f)
	{
		if(f>=1 || f<=0 )
			return null;
		
		StringBuffer binary=new StringBuffer();
		binary.append(".");
		
		while(f>0)
		{
			if(binary.length()>=32)
				return "ERROR";
			
			double r=f*2;
			if(r>=1)
			{
				binary.append("1");
				f=r-1;
			}
			else
			{
				binary.append("0");
				f=r;
			}
		}
		return binary.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convert2Binary(0.625));
	}

}
