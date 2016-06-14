package chapter2;

public class Problem5 {

	static Node add(Node head1,Node head2)
	{
		Node head=null;
		Node current1=head1;
		Node current2=head2;
		int carry=0;
		Node current=null;
		while(current1!=null || current2!=null)
		{
			int val1=(current1!=null)?(int) current1.data:0;
			int val2=(current2!=null)?(int) current2.data:0;
			
			int sum=val1+val2+carry;
			
			Node newNode=new Node(sum%10);
			
			if(head==null)
			{
				head=newNode;
				current=head;
			}
			else
			{
				current.next=newNode;
				current=current.next;
			}
			if(current1!=null)current1=current1.next;
			if(current2!=null)current2=current2.next;
			
			carry=(sum>9)?1:0;
		}
		if(carry==1)
		{
			current.next=new Node(1);
		}
	
		return head;
	}
	static void print(Node n)
	{
		while(n!=null)
		{
			System.out.print(n.data+"->");
			n=n.next;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list1=new LinkedList();
		list1.insertAtFront(7);
		list1.insertAtFront(1);
		list1.insertAtFront(6);
		
		LinkedList list2=new LinkedList();
		list2.insertAtFront(2);
		list2.insertAtFront(9);
		list2.insertAtFront(5);
		
		print(add(list1.head,list2.head));
		
	}

}
