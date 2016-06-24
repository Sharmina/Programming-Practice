package chapter9;

import java.util.ArrayList;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> set=new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> mainList=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> options=new ArrayList<Integer>();
		options.add(1);
		options.add(2);
		options.add(3);

		
		
		subset(mainList,0,new ArrayList<Integer>(),options);
		
		
	}

	static void print(ArrayList<Integer> list)
	{
		for(int i:list)
		{
			System.out.print(i+" ");
		}
		System.out.print("\n");
	}
	private static void subset(ArrayList<ArrayList<Integer>> mainList,int start, ArrayList<Integer> currentList, 
			ArrayList<Integer> options) {
		if(start>=options.size())
		{
		
			return;
		}
		for(int i=start;i<options.size();i++)
		{
			int option=options.remove(i);
			currentList.add(option);
			
			print(currentList);
			mainList.add(new ArrayList<Integer>(currentList));
			subset(mainList,i,currentList,options);
			
			currentList.remove(currentList.size()-1);
			options.add(i, option);;
		}
		
		
		
	}

}
