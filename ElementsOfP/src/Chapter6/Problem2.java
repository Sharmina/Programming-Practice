package Chapter6;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {

	static List<Integer> addOne(List<Integer> num)
	{
		int carry=1;
		for(int i=num.size()-1;i>=0;i--)
		{
			int digit=num.get(i)+carry;
			carry=(digit>9)?1:0;
			digit=digit%10;
			num.set(i,digit);
		}
		if(carry>0)
			num.add(0,1);
		
		return num;
	}
	static void print(List<Integer> num)
	{
		for(int i:num)
		{
			System.out.print(i+" ");
		}
		System.out.println("");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num=new ArrayList<Integer>();
		num.add(8);
		num.add(9);
		addOne(num);
		print(num);
	}

}
