package chapter9;

import java.util.ArrayList;
import java.util.List;

public class Problem5 {

	static void doPermute(List<String> list,StringBuffer s,List<Character> options)
	{
		if(options.size()==0)
		{
			list.add(s.toString());
			return;
		}
		
		for(int i=0;i<options.size();i++)
		{
			s.append(options.get(i));
			Character ch=options.remove(i);
			doPermute(list,s,options);
			options.add(i,ch);
			s.setLength(s.length()-1);
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		List<Character> options=new ArrayList<Character>();
		options.add('a');
		options.add('b');
		options.add('c');
		options.add('d');
		doPermute(list,new StringBuffer(),options);
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}

}
