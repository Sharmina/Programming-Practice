package chapter2;

public class Problem4 {
	
	static Node partition(LinkedList list,int val)
	{
		Node head1=null;
		Node head2=null;
		Node current=list.head;
		
		Node current1=null;
		Node current2=null;
		
		while(current!=null)
		{
			Node n=current.next;
			
			if(((int)current.data)<val)
			{
				if(head1==null)
				{
					head1=current;
					current1=current;
				}
				else
				{
					current1.next=current;
					current1=current;
				}
				
			}
			else
			{
				if(head2==null)
				{
					head2=current;
					current2=current;
				}
				current2.next=current;
				current2=current;
			}
			current=n;
			
		}
		System.out.println("Done");
		if(head1==null)
			return head2;
		else
		{
			current1.next=head2;
			current2.next=null;
			
			return head1;
		}
	}

	static void print(Node n)
	{
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		list.insertAtFront(1);
		list.insertAtFront(10);
		list.insertAtFront(3);
		list.insertAtFront(15);
		
		
		print(partition(list,5));
		
	}

}
