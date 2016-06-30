package chapter11;

class Node
{
	int value;
	Node left;
	Node right;
	int leftSize;
	
	Node(int value)
	{
		this.value=value;
		this.left=null;
		this.right=null;
		this.leftSize=0;
	}
}
public class Problem8 {
	
	static Node root=null;

	static void insert(int val,Node n)
	{
		if(val>n.value)
		{
			if(n.right==null)
			{
				n.right=new Node(val);
			}
			else
				insert(val,n.right);
			
		}
		else
		{
			n.leftSize=n.leftSize+1;
			if(n.left==null)
			{
				n.left=new Node(val);
			}
			else
				insert(val,n.left);
		}
	}
	static void track(int val)
	{
		if(root==null)
		{
			root=new Node(val);
		}
		else
		{
			insert(val,root);
		}
	}
	static int Rank(int value,Node n)
	{
		if(n.value==value)
			return n.leftSize;
		
		if(n.value>value)
		{
			if(n.left==null)
				return -1;
			return Rank(value,n.left);
		}
		else
		{
			if(n.right==null)
				return -1;
			int result=Rank(value,n.right);
			if(result==-1)
				return result;
			else
				return n.leftSize+result+1;
		}
	}
	static int getRank(int val)
	{
		if(root==null)
			return -1;
		else
			return Rank(val,root);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		track(20);
		track(15);
		track(10);
		track(5);
		track(13);
		track(25);
		track(23);
		track(24);
		
		System.out.println(getRank(20));
		System.out.println(getRank(13));
		System.out.println(getRank(10));
		
	}

}
