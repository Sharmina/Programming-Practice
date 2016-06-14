package chapter2;

public class Problem2 {

	static Node kthElement(LinkedList list,int k)
	{
		Node current=list.head;
		
		int i=0;
		while(i<k && current!=null)
		{
			current=current.next;
			i++;
		}
		if(i<k)
			return null;
		Node slow=list.head;
		while(current!=null)
		{
			current=current.next;
			slow=slow.next;
		}
		return slow;
			
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		list.insertAtFront(1);
		list.insertAtFront(2);
		list.insertAtFront(3);
		list.insertAtFront(4);
		
		System.out.println(kthElement(list,2)!=null?kthElement(list,2).data:null);
	}

}
