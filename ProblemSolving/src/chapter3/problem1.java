package chapter3;

public class problem1 {
	
	static final int STACK_SIZE=100;
	static int []buffer=new int[STACK_SIZE*3];
	static int[] stackPointer={-1,-1,-1};
	
	static void push(int stackNum,int value) throws Exception
	{
		if(stackPointer[stackNum]+1>=stackNum*STACK_SIZE+STACK_SIZE)
				throw new Exception("Stack:"+stackNum+"full");
		stackPointer[stackNum]++;
		buffer[absStackPointer(stackNum)]=value;
		
	}
	static int pop(int stackNum) throws Exception
	{
		if(stackPointer[stackNum]==-1)
			throw new Exception("Stacks:"+stackNum+"empty");
		
		int val=buffer[absStackPointer(stackNum)];
		buffer[absStackPointer(stackNum)]=0;
		stackPointer[stackNum]--;
		return val;
	}
	static int peek(int stackNum)
	{
		return buffer[absStackPointer(stackNum)];
	}
	static boolean isEmpty(int stackNum)
	{
		if(stackPointer[stackNum]==-1)
			return true;
		else
			return false;
	}
	static int absStackPointer(int stackNum)
	{
		return stackNum*STACK_SIZE+stackPointer[stackNum];
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		push(0,1);
		push(0,2);
		push(1,1);
		push(1,2);
		push(2,1);
		push(2,2);
		
		System.out.println(peek(0));
		System.out.println(peek(1));
		System.out.println(peek(2));

	}

}
