package chapter4;

public class Problem6 {

	static Node inorderSuccessor(Node n)
	{
		if(n==null)
			return null;
		
		Node current=n;
		if(current.getRight()!=null)
		{
			current=current.right;
		
			while(current.getLeft()!=null)
			{
				current=current.left;
			}
			return current;
		}
		else
		{
			while(current.getParent()!=null && current.getParent().data<current.data)
				current=current.parent;
			
			return current.parent;
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
		
		System.out.println(inorderSuccessor(btree.findNode(3)).data);
	}

}
