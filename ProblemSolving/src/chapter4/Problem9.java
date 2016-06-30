package chapter4;

import java.util.ArrayList;

public class Problem9 {

	static Node root=null;
	static ArrayList<ArrayList<Node>> list=new ArrayList<ArrayList<Node>>();
	private static void findSum(Node root, ArrayList<Node> path, int sum)
	{
		if(root==null)
			return;
		path.add(root);
		int total=0;
		ArrayList<Node> current=new ArrayList<Node>();
		for(int i=path.size()-1;i>=0;i--)
		{
			total+=path.get(i).getValue();
			current.add(path.get(i));
			if(total==sum)
				list.add(new ArrayList<Node>(current));
		}
		
		findSum(root.left,path,sum);
		findSum(root.right,path,sum);
		
		path.remove(root);
		
	}
	
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n=new Node(1);
		root=n;
		n=new Node(5);
		root.left=n;
		n=new Node(3);
		root.right=n;
		n=new Node(2);
		root.left.left=n;
		n=new Node(3);
		root.left.right=n;
		n=new Node(1);
		root.left.left.left=n;
		n=new Node(3);
		root.right.left=n;
		n=new Node(1);
		root.right.right=n;
		n=new Node(2);
		root.right.right.right=n;
		
		findSum(root,new ArrayList<Node>(),8);
		
		for(int i=0;i<list.size();i++)
		{
			System.out.print("[");
			for(Node node:list.get(i))
			{
				System.out.print(node.getValue()+",");
			}
			System.out.println("]");
		}
		
	}

}
