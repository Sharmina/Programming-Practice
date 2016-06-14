package chapter4;

public class Problem8 {

	static boolean findTree(Node root,Node sroot)
	{
		
		if(root==null)
			return false;
		if(root.data==sroot.data)
		{
			System.out.println("found match"+root.data+"and"+sroot.data);
			return matchTree(root,sroot);
		}
		return findTree(root.left,sroot)||findTree(root.right,sroot);
	}
	
	static boolean matchTree(Node root,Node sroot)
	{
		if(root==null && sroot==null)
			return true;
		if(root==null || sroot==null)
			return false;
		
		if(root.data!=sroot.data)
			return false;
		else
			return matchTree(root.left,sroot.left) && matchTree(root.right,sroot.right);
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
		
		BST stree=new BST();
		stree.insert(6);
		stree.insert(7);
		stree.insert(8);
		
		
		System.out.println(findTree(btree.root,stree.root));
	}

}
