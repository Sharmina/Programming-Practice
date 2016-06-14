
public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrieTree t=new TrieTree();
		
		t.insert("hello");
		t.insert("hell");
		t.insert("world");
		
		System.out.println(t.search("hello"));
		System.out.println(t.search("sharmina"));
		System.out.println(t.search("he"));
		System.out.println(t.startsWith("he"));
		System.out.println(t.startsWith("game"));

	}

}
