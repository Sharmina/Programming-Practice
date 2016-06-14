
public class IntBuffer {
	int index;
	int[] buffer;
	IntBuffer()
	{
		index=0;
		buffer=new int[8];
		
	}
	public synchronized void add(int num)
	{
		while(index==buffer.length)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		buffer[index]=num;
		index++;
		notifyAll();
	}
	public synchronized int remove()
	{
		while(index==0)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int ret=buffer[index-1];
		index--;
		notifyAll();
		return ret;
	}

}
