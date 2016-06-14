
public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList list=new LinkedList();
		
		list.insertAtFront(1);
		list.insertAtFront(2);

		list.insertAtFront(3);
		
		System.out.println(list.toString());
		
		list.reverseList();
		
		System.out.println(list.toString());
	}

}
