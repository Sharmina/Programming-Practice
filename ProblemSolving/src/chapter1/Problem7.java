package chapter1;

import java.util.Arrays;

public class Problem7 {

	static void setToZero(int[][] matrix)
	{
		int rows=matrix.length;
		int cols=matrix[0].length;
		
		boolean[] rowArray=new boolean[rows];
		boolean[] colArray=new boolean[cols];
		
		Arrays.fill(rowArray, false);
		Arrays.fill(colArray, false);
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				if(matrix[i][j]==0)
				{
					rowArray[i]=true;
					colArray[j]=true;
				}
			}
		}
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				if(rowArray[i] || colArray[j])
				{
					matrix[i][j]=0;
				}
			}
		}
	}
	static void print(int[][] matrix)
	{
		int m=matrix.length;
		int n=matrix[0].length;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix={{1,0,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		setToZero(matrix);
		print(matrix);
	}

}
