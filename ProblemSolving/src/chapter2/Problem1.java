package chapter2;

import java.util.Hashtable;

public class Problem1 {
	
	static void removeDuplicates(LinkedList list)
	{
		Hashtable<Integer,Integer> htable=new Hashtable<Integer,Integer>();
		Node current=list.head;
		Node prev=null;
		
		while(current!=null)
		{
			if(htable.containsKey(current.data))
			{
				prev.next=current.next;
				current=current.next;
			}
			else
			{
				htable.put((Integer) current.data,1);
				prev=current;
				current=current.next;
			}
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		list.insertAtFront(1);
		list.insertAtFront(2);
		list.insertAtFront(1);
		list.insertAtFront(3);
		
		list.print();
		
		removeDuplicates(list);
		
		list.print();
	
	}

}
