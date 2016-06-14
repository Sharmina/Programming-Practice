package chapter2;
import java.util.NoSuchElementException;

public class LinkedList {
	
	Node head;
	LinkedList()
	{
		this.head=null;
	}
	
	void insertAtFront(int data)
	{
		Node newElement=new Node(data);
		newElement.setNext(head);
		head=newElement;		
		
	}
	Node find(Object data)
	{
		Node element=head;
		
		while(element!=null && element.data!=data)
		{
			element=element.next;
		}
		if(element==null)
			throw new NoSuchElementException();
		else 
			return element;
			
	}
	public String toString()
	{
		Node element=head;
		String list="";
		
		while(element != null)
		{
			list=list+element.data.toString();
			element=element.next;
		}
		return list;
	}
	void insertAfter(Object data, Node n)
	{
		if(n==null)
			throw new NullPointerException();
		
		Node newElement=new Node(data);
		Node currentElement=head;
		
		while(currentElement!=null && currentElement!=n)
		{
			currentElement=currentElement.next;
		}
		
		if(currentElement==null)
		{
			throw new NoSuchElementException();
		}
		else
		{
			newElement.next=currentElement.next;
			currentElement.next=newElement;
		}
	}
	
	void insertBefore(Object data, Node n)
	{
		if(n==null)
			throw new NullPointerException();
		
		Node newElement=new Node(data);
		if(n==head)
		{
			newElement.next=head;
			head=newElement;
			return;
		}
		Node currentElement=head;
		while(currentElement!=null && currentElement.next!=n)
		{
			currentElement=currentElement.next;
		}
		if(currentElement==null)
			throw new NoSuchElementException();
		else
		{
			newElement.next=currentElement.next;
			currentElement.next=newElement;
		}
		
		
	}
	void delete(Node n)
	{
		if(n==null)
			return;
		
		if(n==head)
		{
			head=head.next;
			n=null;
			return;
		}
		
		Node currentElement=head;
		
		
		
		while(currentElement!=null && currentElement.next!=n)
		{
			currentElement=currentElement.next;
		}
		if(currentElement==null)
		{
			throw new NoSuchElementException();
		}
		currentElement.next=n.next;
		n=null;
	}
	
	void emptyList()
	{
		Node currentNode=head;
		
		while(currentNode!=null)
		{
			Node node=currentNode;
			currentNode=currentNode.next;
			node=null;
			
		}
		head=null;
	}
	
	void reverseList()
	{
		if(head==null)
			return;
		
		Node prev=null;
		Node current=head;
		Node next=null;
		while(current!=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
		
	}
	void print()
	{
		Node current=head;
		
		while(current!=null)
		{
			System.out.print(current.data+"->");
			current=current.next;
		}
		System.out.print("\n");
	}
}



