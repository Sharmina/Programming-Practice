package chapter2;

public class Problem3 {

	static void deleteNode(Node node)
	{
		if(node==null||node.next==null)
			return;
		
		int tmp=(int) node.next.data;
		node.next.data=node.data;
		node.data=tmp;
		
		node.next=node.next.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		list.insertAtFront(1);
		list.insertAtFront(2);
		list.insertAtFront(3);
		list.insertAtFront(4);
		
		list.print();
		deleteNode(list.find(2));
		list.print();
		
	}

}
