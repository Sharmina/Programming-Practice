
public class TrieNode {
	public static final int ALPHABET_SIZE=26;
	boolean isLeaf;
	TrieNode[] children;
	
	TrieNode()
	{
		this.isLeaf=false;
		children=new TrieNode[ALPHABET_SIZE];
	}

}
