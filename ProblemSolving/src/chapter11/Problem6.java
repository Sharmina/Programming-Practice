package chapter11;

public class Problem6 {
	
	private static boolean findElement(int[][] matrix,int elem)
	{
		int row=0;
		int col=matrix[0].length-1;
		
		while(col>=0 && row<matrix.length)
		{
			if(matrix[col][row]==elem)
				return true;
			else if(matrix[row][col]>elem)
				col--;
			else
				row++;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix={{15,20,40,85},{20,35,80,95},{30,55,95,105},{40,80,100,120}};
		
		System.out.println(findElement(matrix,80));
		System.out.println(findElement(matrix,22));
	}

}
