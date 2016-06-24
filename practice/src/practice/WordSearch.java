package practice;
class TrieNode
{
    TrieNode[] children;
    boolean isWord;
    
    TrieNode()
    {
    	children=new TrieNode[26];
        for(int i=0;i<26;i++)
        {
            children[i]=null;
        }
        isWord=false;
    }
}


class WordDictionary {
    
    TrieNode root;
    WordDictionary()
    {
        root=new TrieNode();
    }

    // Adds a word into the data structure.
    public void addWord(String word) {
        
        TrieNode current=root;
        for(int i=0;i<word.length();i++)
        {
            int index=word.charAt(i)-'a';
            if(current.children[index]==null)
            {
                TrieNode t=new TrieNode();
                current.children[index]=t;
            }
            current=current.children[index];
            
        }
        current.isWord=true;
            
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search1(String word) {
        
        TrieNode current=root;
        for(int i=0;i<word.length();i++)
        {
            int index=word.charAt(i)-'a';
            if(current.children[index]==null)
            {
                return false;
            }
                
            
            current=current.children[index];
            
        }
        return current.isWord;
        
    }
    public boolean TrieSearch(TrieNode t,String word,int i)
    {
    	if(t==null)
    		return false;
    	if(i==word.length())
    		return t.isWord;
    	
    	
    	if(word.charAt(i)=='.')
    	{
    		for(int j=0;j<26;j++)
    		{
    			boolean result=TrieSearch(t.children[j],word,i+1);
    			if(result)
    				return true;
    		}
    		return false;
    	}
    	else
    	{
    		int index=word.charAt(i)-'a';
    		return TrieSearch(t.children[index],word,i+1);
    	}
    }
    public boolean search(String word) {
        
    	return TrieSearch(root,word,0);
        
        
    }
}
public class WordSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordDictionary wordDictionary = new WordDictionary();
		wordDictionary.addWord("word");
		System.out.println(wordDictionary.search("w.rd."));
	}

}
