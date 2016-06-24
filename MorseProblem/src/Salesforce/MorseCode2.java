package Salesforce;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import javafx.scene.Parent;

class Node
{
	boolean isWord;
	ArrayList<String> words;
	Node left;
	Node right;
	Node parent;
	
	Node()
	{
		isWord=false;
		words=new ArrayList<String>();
		right=null;
		left=null;
		parent=null;
	}
}

public class MorseCode2 {

		static String filepath="C:\\Users\\sahmed7\\Desktop\\input.txt";
		static Hashtable<String,String> hcode=new Hashtable<String,String>();
		
		static Node root=new Node();
		
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
					Node current=root;
					
					///Building the morseCode for each context word
					for(int i=0;i<input.length();i++)
					{
						String individualChar=input.substring(i,i+1);
						
						String code=hcode.get(individualChar);
						
						for(int j=0;j<code.length();j++)
						{
							if(code.charAt(j)=='.')
							{
								if(current.left==null)
								{
									Node left=new Node();
									current.left=left;
									left.parent=current;
								}
								current=current.left;
							}
							else if(code.charAt(j)=='-')
							{
								if(current.right==null)
								{
									Node right=new Node();
									current.right=right;
									right.parent=current;
								}
								current=current.right;
							}
							else
								throw new Exception("Illegal character in context area");
							
						}
						
					}
					current.isWord=true;
					current.words.add(input);
					
					
					
					
					
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
		
	
		//doing dfs to get all the children of this node
		//this will return all combinations in context with this prefix
			
		private static void getAllChildren(Node current,ArrayList<String> list)
		{
			if(current==null)
				return;
			
			if(current.isWord)
			{
				for(String word:current.words)
					list.add(word);
			}
			getAllChildren(current.left,list);
			getAllChildren(current.right,list);
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
						Node current=root;
						for(int i=0;i<word.length();i++)
						{
							
							if(word.charAt(i)=='.')
							{
								if(current.left!=null)
									current=current.left;
								else
									break;
								
									
							}
							else if(word.charAt(i)=='-')
							{
								if(current.right!=null)
									current=current.right;
								else
									break;
							}
							else
								throw new Exception("Illegal character in input area");
						}
						if(current.isWord)
						{
							if(current.words.size()==1)
								System.out.println(current.words.get(0));
							
							else
							{
								System.out.println(current.words.get(findMin(current.words))+"!");
							}
						}
						else
						{
							ArrayList<String> list=new ArrayList<String>();
							getAllChildren(current,list);
							if(list.size()==0)
								System.out.println("No match!");
							else
							{
								if(list.size()==1)
									System.out.println(list.get(0)+"?");
								
								else
								{
									System.out.println(list.get(findMin(list))+"?");
								}
							}
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
			
			
			
			try {
				
				File f=new File(filepath);
				
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

	

