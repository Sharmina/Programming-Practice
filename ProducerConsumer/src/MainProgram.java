
public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntBuffer b=new IntBuffer();
		Producer p1=new Producer(b);
		Producer p2=new Producer(b);
		Consumer c=new Consumer(b);
		
		p1.start();
		p2.start();
		c.start();

	}

}
