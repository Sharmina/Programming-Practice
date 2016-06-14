package chapter4;

public class Node {
	
	int data;
	Node left;
	Node right;
	Node parent;
	
	Node(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
		this.parent=null;
	}
	int getValue()
	{
		return this.data;
	}
	Node getLeft()
	{
		return this.left;
	}
	Node getRight()
	{
		return this.right;
	}
	Node getParent()
	{
		return this.parent;
	}

}
