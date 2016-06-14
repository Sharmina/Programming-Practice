/*
 * Given an arrayOfInts, find the highestProduct you can get from three of the integers.
 
	The input arrayOfInts will always have at least three integers.
*/


public class Problem3 {

	static int findHighestProductof3(int[] input)
	{
		
		if(input.length<3)
			throw new IllegalArgumentException("array must contain atleast 3 elements");
		
		int highest_product_of_3=input[0]*input[1]*input[2];
		int highest_product_of_2=input[0]*input[1];
		int lowest_product_of_2=input[0]*input[1];
		int highest=Math.max(input[0], input[1]);
		int lowest=Math.min(input[0],input[1]);
		
		for(int i=2;i<input.length;i++)
		{
			int current=input[i];
			highest_product_of_3=Math.max(Math.max(highest_product_of_3,highest_product_of_2*input[i]),lowest_product_of_2*input[i]);
			highest_product_of_2=Math.max(Math.max(highest_product_of_2,highest*current),lowest*current);
			lowest_product_of_2=Math.min(Math.min(lowest_product_of_2,highest*current),lowest*current);
			highest=Math.max(current,highest);
			lowest=Math.min(current,lowest);
		}
		return highest_product_of_3;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input={1,10,-5,1,-100};
		System.out.println(findHighestProductof3(input));
	}

}
