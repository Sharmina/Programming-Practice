package chapter2;

class Result{
	Node n;
	boolean r;
	
	Result(Node n,boolean r)
	{
		this.n=n;
		this.r=r;
	}
}
public class Problem7 {
	
	
	static Result isPalindromeRecurse(Node head,int length)
	{
		if(length==0 || head==null)
			return new Result(null,true);
		
		if(length==1)
		{
			return new Result(head.next,true);
		}
		if(length==2)
		{
			return new Result(head.next.next,head.data==head.next.data);
		}
		Result r=isPalindromeRecurse(head.next,length-2);
		if(r.r==false || r.n==null)
			return r;
		else
		{
			r.r=head.data==r.n.data;
			r.n=r.n.next;
			
			return r;
		}
	}

	static boolean isPalindrome(Node head)
	{
		Result r=isPalindromeRecurse(head,getLength(head));
		
		return r.r;
	}
	static int getLength(Node head)
	{
		int i=0;
		Node current=head;
		
		while(current!=null)
		{
			current=current.next;
			i++;
		}
		return i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		list.insertAtFront(3);
		list.insertAtFront(2);
		list.insertAtFront(1);
		list.insertAtFront(2);
		list.insertAtFront(3);
		list.insertAtFront(4);
		
		System.out.println(isPalindrome(list.head));
	}

}
