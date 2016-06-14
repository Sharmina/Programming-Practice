
public class Node {
	
	Object data;
	Node next;
	
	Node(Object data)
	{
		this.data=data;
		this.next=null;
	}
	void setNext(Node next)
	{
		this.next=next;
	}
	Node getNext()
	{
		return this.next;
	}

}
