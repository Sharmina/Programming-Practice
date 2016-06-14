
public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heap heap=new Heap();
		heap.insert(new Pair("3",1));
		heap.insert(new Pair("2",2));
		
		
		
		
		heap.extractMin();
		heap.insert(new Pair("1",3));
		heap.print();

	}

}
