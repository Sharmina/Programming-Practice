package chapter4;
///check if a binary tree is a binary search tree
public class Problem5 {
	
	static boolean checkBST(Node root, int min, int max)
	{
		if(root==null)
			return true;
		
		if(checkBST(root.left,min,root.data)==false)
			return false;
		if(checkBST(root.right,root.data,max)==false)
			return false;
		
		if(root.data>min && root.data<max)
			return true;
		else
			return false;
		
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
		btree.findNode(1).data=10;
		
		System.out.println(checkBST(btree.root,Integer.MIN_VALUE,Integer.MAX_VALUE));
	}

}
