import java.util.Random;

public class Producer extends Thread{
	
	IntBuffer buffer;
	Producer(IntBuffer b)
	{
		
		this.buffer=b;
	}
	public void run()
	{
		Random r=new Random();
		while(true)
		{
			int num=r.nextInt();
			buffer.add(num);
			System.out.println("produced..."+num);
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
