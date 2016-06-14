package chapter5;

import java.util.ArrayList;

public class Problem7 {

	static int getBit(int i,int position)
	{
		return ((i>>position)&1);
	}
	static int findMissingRecurse(ArrayList<Integer> input, int position)
	{
		ArrayList<Integer> zeroBits=new ArrayList<Integer>();
		ArrayList<Integer> oneBits=new ArrayList<Integer>();
		
		if(position>31)
			return 0;
		
		for(Integer i:input)
		{
			if(getBit(i,position)==1)
				oneBits.add(i);
			else
				zeroBits.add(i);
				
		}
		if(zeroBits.size()<=oneBits.size())
		{
			int v=findMissingRecurse(zeroBits,position+1);
			return (v<<1)|0; 
		}
		else
		{
			int v=findMissingRecurse(oneBits,position=1);
			return (v<<1)|1; 
		}
		
	}
	public static int findMissing(ArrayList<Integer> input)
	{
		return findMissingRecurse(input,0);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums=new ArrayList<Integer>();
		nums.add(new Integer(0));
		nums.add(new Integer(1));
		nums.add(new Integer(2));
		nums.add(new Integer(3));
		nums.add(new Integer(5));
	
		System.out.println(findMissing(nums));
	}

}

