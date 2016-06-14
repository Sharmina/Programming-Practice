/*
 * 
 * 
 * 	You have an array of integers, and for each index you want to find the product of every integer except the integer at that index.
	Write a function getProductsOfAllIntsExceptAtIndex() that takes an array of integers and returns an array of the products.

	For example, given:

  	[1, 7, 3, 4]

	your function would return:

  	[84, 12, 28, 21]

	by calculating:

  	[7*3*4, 1*3*4, 1*7*4, 1*7*3]

	Do not use division in your solution.
 */
public class Problem2 {
	
	static int[] getProductsOfAllIntsExceptAtIndex(int[] array)
	{
		int[] output=new int[array.length];
	
		int product=1;
		for(int i=0;i<array.length;i++)
		{
			output[i]=product;
			product=product*array[i];
			
		}
		product=1;
		for(int i=array.length-1;i>=0;i--)
		{
			output[i]=product*output[i];
			product=product*array[i];
		}
		
		return output;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input={1,7,3,4};
		
		int[] output=getProductsOfAllIntsExceptAtIndex(input);
		for(int i:output)
		{
			System.out.println(i+" ");
		}
	}

}
