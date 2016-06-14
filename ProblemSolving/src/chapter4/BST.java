package chapter4;

public class BST {

	Node root;
	BST()
	{
		root=null;
	}
	
	boolean insert(int data) 
	{
		Node newNode=new Node(data);
		
		if(root==null)
		{
			root=newNode;
			return true;
		}
		Node current=root;
		
		while(true)
		{
			if(current.getValue()==data)
				return false;
			if(data>current.getValue())
			{	if(current.right!=null)
					current=current.getRight();
			    else
			    {
			    	current.right=newNode;
			    	newNode.parent=current;
			    	return true;
			    }
			}
			else
			{
				if(current.left!=null)
					current=current.getLeft();
				else
				{
					current.left=newNode;
					newNode.parent=current;
					return true;
				}
			}
		}
		
	}
	Node findNode(int n)
	{
		Node current=root;
		
		while(current!=null)
		{
			if(current.getValue()==n)
				return current;
			if(n>current.getValue())
				current=current.right;
			else
				current=current.left;
		}
		return null;
	}
	Node predecessor(Node n)
	{
		if(n==null)
			return null; 
		if(n.getLeft()!=null)
		{
			Node current=n.getLeft();
			while(current.right!=null)
			{
				current=current.right;
			}
			return current;
		}
		else
		{
			Node current=n;
			while(current!=null && current.getParent()!=null)
			{
				if(current.getParent().data<current.data)
					return current.getParent();
				current=current.getParent();
			}
		}
		return null;
		
	}
	Node successor(Node n)
	{
		if(n==null)
			return null; 
		if(n.getRight()!=null)
		{
			Node current=n.getRight();
			while(current.getLeft()!=null)
			{
				current=current.getLeft();
			}
			return current;
		}
		else
		{
			Node current=n;
			while(current!=null && current.getParent()!=null)
			{
				if(current.data<current.getParent().data)
					return current.getParent();
				current=current.parent;
			}
		}
		return null;
	}
	void inorderTraversal(Node n)
	{
		if(n==null)
			return;
		inorderTraversal(n.left);
		System.out.println(n.data);
		inorderTraversal(n.right);
	}
	boolean isLeftChild(Node parent, Node child)
	{
		if(parent.left==child)
			return true;
		else
			return false;
	}
	void deleteNode(Node current)
	{
		
		
		if(current.getLeft()==null && current.getRight()==null)
		{
			if(root==current)
			{
				root=null;
				return;
			}
			if(isLeftChild(current.parent,current))
				current.parent.left=null;
			else
				current.parent.right=null;
			
			
			return;
		}
		else if(current.getLeft()==null || current.getRight()==null )
		{
			Node child;
			if(current.getLeft()!=null)
				child=current.getLeft();
			else
				child=current.getRight();
			
			if(root==current)
			{
				root=child;
				return;
			}
			if(isLeftChild(current.parent,current))
			{
				current.getParent().left=child;
			
			}
			else
			{
				current.getParent().right=child;
			}
			child.parent=current.parent;
			return;
		}
		
		else
		{
			Node predecessor=predecessor(current);
			
			int tmp=current.data;
			current.data=predecessor.data;
			predecessor.data=tmp;
			
			deleteNode(predecessor);
		}
		
	}
	
}
