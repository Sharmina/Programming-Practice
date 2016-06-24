package Salesforce;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class MorseCode {

	static Hashtable<String,String> hcode=new Hashtable<String,String>();
	static Hashtable<String,List<String>> context=new Hashtable<String,List<String>>();
	//Read the character codes first
	private static void readCodes(BufferedReader breader)
	{
		
		while(true)
		{
			try
			{
				String input=breader.readLine().trim();
				if(input.equals("*"))
					break;
				String[] parts=input.split("\\s+");
				if(hcode.containsKey(parts[0].toUpperCase()))
				{
					throw new Exception("Error in code: multiple enties for same character");
				}
				hcode.put(parts[0].toUpperCase(),parts[1]);
				//System.out.println("Inserting "+parts[0]+" "+parts[1]+"in hashcode");
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	private static void readContext(BufferedReader breader)
	{
		while(true)
		{
			try
			{
				String input=breader.readLine().trim();
				if(input.equals("*"))
					break;
				StringBuffer codeBuilder=new StringBuffer();
				
				///Building the morseCode for each context word
				for(int i=0;i<input.length();i++)
				{
					String individualChar=input.substring(i,i+1);
					
					String code=hcode.get(individualChar);
					if(code==null)
						throw new Exception("ILLegal character in context");
					
					
					codeBuilder.append(code);
				}
				String codeForWord=codeBuilder.toString();
				//System.out.println("Code for context word:"+input+" "+codeForWord);
				
				///if there is a duplicate with the same morese code add to a list
				if(context.containsKey(codeForWord))
				{
					context.get(codeForWord).add(input);
				}
				//else add a new entry
				else
				{
					List<String> possibleWords=new ArrayList<String>();
					possibleWords.add(input);
					context.put(codeForWord, possibleWords);
				}
				
				
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	///returns the min length element ,if multiple elements are minimum length returns the first one in the context
	private static int findMin(ArrayList<String> possiblewords)
	{
		int min=Integer.MAX_VALUE;
		int minIndex=0;
		for(int i=0;i<possiblewords.size();i++)
		{
			
			if(min>possiblewords.get(i).length())
			{
				min=possiblewords.get(i).length();
				//System.out.println(possiblewords.get(i));
				//System.out.println(possiblewords.get(i).length());
				minIndex=i;
			}
		}
		return minIndex;
		
	}
	
	private static String getLongestMatch(String input)
	{
		int maxMatch=Integer.MIN_VALUE;
		String maxMatchKey="";
		
		
		
		for(String key:context.keySet())
		{
			int matchCount=0;
			for(int i=0;i<input.length();i++)
			{
				if(i>key.length()-1)
					break;
				if(key.charAt(i)==input.charAt(i))
					matchCount++;
				else
					break;
			}
			//System.out.println("Match count for :"+key+" and "+input+"is "+matchCount );
			if(matchCount>maxMatch)
			{
				maxMatch=matchCount;
				maxMatchKey=key;
			}
			
			
		}
		return maxMatchKey;
		
			
	}
		
		
		
	
	private static void readInput(BufferedReader breader)
	{
		while(true)
		{
			try
			{
				String input=breader.readLine().trim();
				if(input.equals("*"))
					break;
				
				String[] words=input.split("\\s+");
				
				for(String word:words)
				{
					///there is at least one perfect match
					if(context.containsKey(word))
					{
						ArrayList<String> possibleWords=(ArrayList<String>) context.get(word);
						///if only one perfect match
						if(possibleWords.size()==1)
						{
							System.out.println(possibleWords.get(0));
						}
						//more than one match
						else
						{
							System.out.println(possibleWords.get(findMin(possibleWords))+"!");
						}
					}
					else
					{
						//System.out.println("No matches YET");
						//break;
						
						/*
						 * TODO: find the longest match with the word to all the hash keys
						 */
						
						
						String key=getLongestMatch(word);
						System.out.println(context.get(key).get(0)+"?");
						
					}
					
				}
				
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f=new File("C:\\Users\\sahmed7\\Desktop\\input.txt");
		
		try {
			FileReader freader=new FileReader(f);
			BufferedReader breader=new BufferedReader(freader);
			
			///we first read the codes and put it in a hashtable
			readCodes(breader);
			
			///we read context and push it in another hashtable with their morsecode
			readContext(breader);
			
			//now read the actual input
			readInput(breader);
			
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
