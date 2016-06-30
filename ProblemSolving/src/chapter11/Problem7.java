package chapter11;

import java.util.ArrayList;
import java.util.Collections;

class WHPair implements Comparable
{
	int weight;
	int height;
	
	WHPair(int height,int weight)
	{
		this.height=height;
		this.weight=weight;
	}
	
	

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		WHPair arg=(WHPair)o;
		return this.height-arg.height;
	}
}



public class Problem7 {

	private static void print(ArrayList<WHPair> input)
	{
		for(WHPair item:input)
		{
			System.out.print("("+item.height+","+item.weight+")");
		}
		System.out.print("\n");
	}
	private static int LIS(ArrayList<WHPair> input)
	{
		int[] maxIncSeq=new int[input.size()];
		for(int i=0;i<input.size();i++)
		{
			maxIncSeq[i]=1;
		}
		for(int i=0;i<input.size();i++)
		{
			for(int j=0;j<i;j++)
			{
				if(input.get(i).weight>input.get(j).weight && maxIncSeq[i]<maxIncSeq[j]+1)
				{
					maxIncSeq[i]=maxIncSeq[j]+1;
				}
			}
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<input.size();i++)
		{
			if(maxIncSeq[i]>max)
				max=maxIncSeq[i];
		}
		return max;
	}
	private static int buildTower(ArrayList<WHPair> input)
	{
		
		Collections.sort(input);
		
		print(input);
		
		return LIS(input);
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<WHPair> list=new ArrayList<WHPair>();
		list.add(new WHPair(3,5));
		list.add(new WHPair(4,6));
		list.add(new WHPair(10,8));
		list.add(new WHPair(2,4));
		list.add(new WHPair(1,1));
		list.add(new WHPair(10,5));
		
		System.out.println(buildTower(list));
		
	}

}
