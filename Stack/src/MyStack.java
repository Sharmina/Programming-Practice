import java.util.EmptyStackException;

public class MyStack {

	Node head;
	int size;
	MyStack()
	{
		head=null;
		size=0;
	}
	void push(Object data)
	{
		Node newElement=new Node(data);
		
		newElement.next=head;
		head=newElement;
		size++;
	}
	Object pop()
	{
		if(head==null)
			throw new EmptyStackException();
		Node element=head;
		Object data=head.data;
		
		head=head.next;
		element=null;
		size--;
		return data;
		
	}
	int size()
	{
		return size;
	}
	void empty()
	{
		if(head==null)
			return;
		
		while(head!=null)
		{
			Node element=head;
			head=head.next;
			element=null;
		}
		
	}
}
