package chapter4;

///checking if a binary tree is balanced

public class Problem1 {
	
	static int checkHeight(Node root)
	{
		if(root==null)
			return 0;
		
		int leftHeight=checkHeight(root.left);
		if(leftHeight==-1)
			return -1;
		int rightHeight=checkHeight(root.right);
		if(rightHeight==-1)
			return -1;
		
		if(Math.abs(leftHeight-rightHeight)>1)
			return -1;
		
		else
			return Math.max(leftHeight,rightHeight)+1;
			
	}

	private static boolean isBalanced(Node root)
	{
		if(root==null)
			return true;
		
		
		if(checkHeight(root)==-1)
			return false;
		else
			return true;
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
		//System.out.println(checkHeight(btree.findNode(4)));
		System.out.println(isBalanced(btree.root));
	}

}
