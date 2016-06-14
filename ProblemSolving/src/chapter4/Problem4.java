package chapter4;

import java.util.LinkedList;
import java.util.List;

public class Problem4 {

	static List<List<Node>> list=new LinkedList<List<Node>>();
	static void createLevelLinkedList(Node root)
	{
		List<Node> level=new LinkedList<Node>();
		level.add(root);
		
		list.add(level);
		
		while(!level.isEmpty())
		{
			List<Node> current=level;
			level=new LinkedList<Node>();
			for(Node parent: current)
			{
			
				if(parent.left!=null)level.add(parent.left);
				if(parent.right!=null)level.add(parent.right);
			
			}
			list.add(level);
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST btree=new BST();
		btree.insert(3);
		btree.insert(1);
		btree.insert(2);
		btree.insert(5);
		btree.insert(4);
		btree.insert(6);
		btree.insert(7);
		btree.insert(8);
		
		createLevelLinkedList(btree.root);
	
		for(int i=0;i<list.size();i++)
		{
		
			for(int j=0;j<list.get(i).size();j++)
			{
				System.out.print(list.get(i).get(j).getValue()+" ");
			}
			System.out.println("");
		}

	}

}
