package chapter4;

public class problem3 {

	static Node createMinimalBST(int[] array,int start,int end)
	{
		if(start>end)
			return null;
		
		int mid=(int) (start+Math.ceil((end-start)/2));
		
		Node n=new Node(array[mid]);
		
		n.left=createMinimalBST(array,start,mid-1);
		n.right=createMinimalBST(array,mid+1,end);
		
		
		if(n.left!=null)n.left.parent=n;
		if(n.right!=null)n.right.parent=n;
		
		return n;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={1,2,3,4,5,6};
		BST btree=new BST();
		btree.root=createMinimalBST(array,0,array.length-1);
		
		btree.inorderTraversal(btree.root);
		
	}

}
