package chapter1;



public class Problem6 {

	static void transpose(int[][] matrix)
	{
		int m=matrix.length;
		int n=matrix[0].length;
		
		for(int i=0;i<m;i++)
		{
			for(int j=i;j<n;j++)
			{
				int tmp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=tmp;
			}
		}
	}
	static void verticalReflection(int[][] matrix)
	{
		int m=matrix.length;
		int n=matrix[0].length;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<Math.ceil(n/2);j++)
			{
				int tmp=matrix[i][j];
				matrix[i][j]=matrix[i][n-1-j];
				matrix[i][n-1-j]=tmp;
			}
		}
	}
	static void horizontalReflection(int[][] matrix)
	{
		int m=matrix.length;
		int n=matrix[0].length;
		for(int i=0;i<Math.ceil(m/2);i++)
		{
			for(int j=0;j<n;j++)
			{
				int tmp=matrix[i][j];
				matrix[i][j]=matrix[m-1-i][j];
				matrix[m-1-i][j]=tmp;
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
		int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		System.out.println("original matrix:");
		print(matrix);
		transpose(matrix);
		System.out.println("after transpose");
		print(matrix);
		System.out.println("After reflection");
		verticalReflection(matrix);
		print(matrix);
		System.out.println("After reflection");
		horizontalReflection(matrix);
		print(matrix);

	}

}
