
public class TrieTree {
	
	TrieNode root;
	
	TrieTree()
	{
		root=new TrieNode();
	}
	
	void insert(String word)
	{
		int i=0;
		TrieNode current=root;
		while(i<word.length())
		{
			int index=word.charAt(i)-'a';
			if(current.children[index]==null)
			{
				current.children[index]=new TrieNode();
			}
			current=current.children[index];
			i++;
			
		}
		current.isLeaf=true;
		
	}
	boolean search(String word)
	{
		int i=0;
		TrieNode current=root;
		while(i<word.length())
		{
			int index=word.charAt(i)-'a';
			if(current.children[index]==null)
			{
				return false;
			}
			current=current.children[index];
			i++;
			
		}
		if(current.isLeaf==false)
			return false;
		return true;
	}
	boolean startsWith(String prefix)
	{

		int i=0;
		TrieNode current=root;
		while(i<prefix.length())
		{
			int index=prefix.charAt(i)-'a';
			if(current.children[index]==null)
			{
				return false;
			}
			current=current.children[index];
			i++;
			
		}
		return true;
	}
}
