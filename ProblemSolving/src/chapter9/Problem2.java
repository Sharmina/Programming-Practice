package chapter9;

public class Problem2 {

	static int noOfPossiblePaths(int x,int y,int[][] matrix)
	{
		if(x==0 && y==0)
		{
			matrix[0][0]=1;
			return 1;
		}
		if(x<0)
		{	return 0;
		}
		if(y<0)
		{
			return 0;
		}
		else
		{
			if(matrix[x][y]!=-1)
				return matrix[x][y];
			else
			{
				matrix[x][y]=noOfPossiblePaths(x-1,y,matrix)+noOfPossiblePaths(x,y-1,matrix);
				return matrix[x][y];
			}
				
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][]=new int [3][4];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
				matrix[i][j]=-1;
		}
		System.out.println(noOfPossiblePaths(2,3,matrix));
		
	}

}
