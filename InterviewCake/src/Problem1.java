/*
 * Suppose we could access yesterday's stock prices as an array, where:

	The indices are the time in minutes past trade opening time, which was 9:30am local time.
	The values are the price in dollars of Apple stock at that time.
	So if the stock cost $500 at 10:30am, stockPricesYesterday[60] = 500.

	Write an efficient function that takes stockPricesYesterday and returns the best 
 */
public class Problem1 {

	
	
	static int getMaxProfit(int[] stockPricesYesterday) {
		
		if(stockPricesYesterday.length<2)
			throw new IllegalArgumentException("The stock array must have at least two items");
		int maxProfit=stockPricesYesterday[1]-stockPricesYesterday[0];
		int currentMin=stockPricesYesterday[0];
		
		for(int i=1;i<stockPricesYesterday.length;i++)
		{
			int profit=stockPricesYesterday[i]-currentMin;
			if(profit>maxProfit)
			{
				maxProfit=profit;
			}
			if(stockPricesYesterday[i]<currentMin)
			{
				currentMin=stockPricesYesterday[i];
			}
				
		}
		
		return maxProfit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] stockPricesYesterday = new int[]{10, 7, 5, 8, 11, 9};
		System.out.println(getMaxProfit(stockPricesYesterday));

	}

}
