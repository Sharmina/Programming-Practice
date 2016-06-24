package practice;


class ThreadC extends Thread
{
	int id;
	Turn s;
	public ThreadC(int i,Turn s2) {
		// TODO Auto-generated constructor stub
		this.id=i;
		this.s=s2;
	}
	public void run()
	{
		
		
		while(true)
		{
			s.printID(id);
			try {
				sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}			
		
	}
	
	
}
class Turn
{
	public int turn=0;
	
	void increase()
	{
		turn=(turn+1)%3;
	}
	
	synchronized void printID(int id)
	{
		while(turn!=id)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(id);
		turn=(turn+1)%3;
		notifyAll();
		
	}
}

public class ThreadScheduling {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Turn s=new Turn();
		ThreadC t1=new ThreadC(0,s);
		ThreadC t2=new ThreadC(1,s);
		ThreadC t3=new ThreadC(2,s);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
