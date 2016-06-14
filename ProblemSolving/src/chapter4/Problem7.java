package chapter4;

public class Problem7 {

	boolean covers(Node root,Node p)
	{
		if(root==null)
			return false;
		if(root==p)
			return true;
		return covers(root.left,p)||covers(root.right,p);
					
	}
	Node commonAncestor(Node root,Node p, Node q)
	{
		if(root==null)
			return null;
		if(p==root)
			return p;
		if(q==root)
			return q;
		boolean is_p_left_subtree=covers(root.left,p);
		boolean is_q_left_subtree=covers(root.left,q);
		
		if(is_p_left_subtree!=is_q_left_subtree)
			return root;
		
		Node childside=is_p_left_subtree?root.left:root.right;
		return commonAncestor(childside,p,q);
	}
	Node findCommonAncestor(Node root,Node p, Node q)
	{
		if(root==null || p==null || q==null)
			return null;
		else
			return commonAncestor(root, p,q);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
