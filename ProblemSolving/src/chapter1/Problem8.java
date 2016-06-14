package chapter1;

public class Problem8 {

	static boolean isRotation(String s1,String s2)
	{
		int length=s1.length();
		
		if(length==s2.length() & length>0)
		{
			String s1s1=s1.concat(s1);
		
		
			if(s1s1.contains(s2))
				return true;
		}
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isRotation("waterbottle", "erbottlewat"));
		
		System.out.println(isRotation("waterbottle", "wat"));

	}

}
