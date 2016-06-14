package chapter11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.LinkedList;

public class Problem2 {
	
	//solution 1
	public static String[] groupAnagrams(String[] strList)
	{
		Hashtable<String,LinkedList<String>> hTable=new Hashtable<String,LinkedList<String>>();
		
		for(String s:strList){
			char[] cList=s.toLowerCase().toCharArray();
			Arrays.sort(cList);
			String str=new String(cList);
			
			if(!hTable.containsKey(str))
			{
				hTable.put(str, new LinkedList<String>());
			}
			LinkedList<String> anagrams=hTable.get(str);
			anagrams.add(s);
		}
		String[] result=new String[strList.length];
		int index=0;
		for(String s:hTable.keySet())
		{
			LinkedList<String> str=hTable.get(s);
			for(String currentStr:str){
					result[index++]=currentStr;
			}
		}
		
		return result;
		
		
	}
	//solution 2
	public static class AnagramComparator implements Comparator<String>
	{

		public String sortchars(String s)
		{
			char[] sorted=s.toLowerCase().toCharArray();
			
			
			Arrays.sort(sorted);
			return new String(sorted);
		}
		@Override
		public int compare(String arg0, String arg1) {
			// TODO Auto-generated method stub
			return sortchars(arg0).compareTo(sortchars(arg1));
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strlist={"efg","cde","de","edc","fge","efg","xy"};
		String[] result=groupAnagrams(strlist);
		System.out.println("First solution");
		for(String s:result)
		{
			System.out.println(s);
		}
		
		Arrays.sort(strlist,new AnagramComparator());
		System.out.println("Second solution");
		for(String s:strlist)
		{
			System.out.println(s);
		}
		
	}

}
