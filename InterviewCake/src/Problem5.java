import java.util.Arrays;

public class Problem5 {

public static int changePossibilitiesTopDown(int amount, int[] coins) {

		int numOfPossibilities=0;

		if(amount==0)
			return 1;
		if(amount<0)
			return 0;
		if(coins.length==0)
			return 0;
		
		System.out.println("ways to make"+amount+" with"+Arrays.toString(coins));
		int coin=coins[0];
		int[] restOfCoins=Arrays.copyOfRange(coins, 1, coins.length);
		
		while(amount>=0)
		{
			numOfPossibilities+=changePossibilitiesTopDown(amount,restOfCoins);
			amount-=coin;
		}
	
		return numOfPossibilities;
        
       
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins={1,2,3};
		System.out.println(changePossibilitiesTopDown(4,coins));

	}

}
