package chapter5;

import java.util.Arrays;

public class Problem8 {

	static void drawLine(byte[] screen, int width, int x1, int x2, int y)
	{
		int byte_offset_x1=x1%8;
		int byte_offset_x2=x2%8;
		
		int full_byte_x1=x1/8;
		if(byte_offset_x1!=0)
			full_byte_x1++;
		int full_byte_x2=x2/8;
		if(byte_offset_x2!=7)
			full_byte_x2--;
		
		for(int b=full_byte_x1;b<=full_byte_x2;b++)
		{
			screen[(width/8)*y+b]=(byte)0xFF;
		}
		int startMask=0xFF>>byte_offset_x1;
		int endMask=~(0xFF>>(byte_offset_x2+1));
		
		if(x1/8==x2/8)
		{
			int mask=startMask&endMask;
			int index=(width/8)*y+full_byte_x1;
			screen[index]|=mask;
		}
		else
		{
			if(byte_offset_x1!=0)
			{
				int index=(width/8)*y+full_byte_x1-1;
				screen[index]|=startMask;
			}
			if(byte_offset_x2!=7)
			{
				int index=(width/8)*y+full_byte_x1+1;
				screen[index]|=endMask;
			}
		}
	}
	static void printScreen(byte[] screen,int width)
	{
		for(int i=0;i<screen.length;i++)
		{
			if(i%(width/8)==0)
				System.out.print("\n");
			
			System.out.print(screen[i]);
				
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] screen=new byte[30];
		Arrays.fill(screen,(byte)0);
		
		printScreen(screen,24);
		drawLine(screen,24,5,16,3);
		printScreen(screen,24);

	}

}
