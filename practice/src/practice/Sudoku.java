package practice;

public class Sudoku {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x=0;x<3;x++)
		{
			
			for (int y=0;y<3;y++)
			{
				for(int i=0;i<3;i++)
				{
					for(int j=0;j<3;j++)
					{
						int x_offset=i+3*x;
						int y_offset=j+3*y;
						
						System.out.print(x_offset+","+y_offset+" ");
					}
					System.out.print("\n");
				}
				
				
				
			
			}
			
		}
	}

}
