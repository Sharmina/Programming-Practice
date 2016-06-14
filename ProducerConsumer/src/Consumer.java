

public class Consumer extends Thread{
	
	IntBuffer buffer;
	Consumer(IntBuffer b)
	{
		
		this.buffer=b;
	}
	public void run()
	{
		
		while(true)
		{
			
			int num=buffer.remove();
			System.out.println("consumed..."+num);
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
