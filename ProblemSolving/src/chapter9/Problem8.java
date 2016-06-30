package chapter9;

import java.util.Arrays;
import java.util.HashMap;

public class Problem8 {
	
	static HashMap<String,Integer> memorize=new HashMap<String, Integer>();
	static private int makeChange(int amount,int[] possibleCoins)
	{
		if(amount==0)
			return 1;
		
		if(amount<0)
			return 0;
		
		if(possibleCoins.length==0)
			return 0;
		
		int coin=possibleCoins[0];
		int[] restOfCoins=Arrays.copyOfRange(possibleCoins, 1, possibleCoins.length);
		int originalAmount=amount;
		
		String s="Make "+originalAmount+" out of"+Arrays.toString(possibleCoins);
		if(memorize.containsKey(s))
		{
			System.out.println("fetching from memory");
			return memorize.get(s);
		}
		
		
		int numOfWays=0;
		while(amount>=0)
		{
			numOfWays+=makeChange(amount,restOfCoins);
			amount-=coin;
		}
		
		if(!memorize.containsKey(s))
			memorize.put(s,numOfWays);
		return numOfWays;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins={1,2,3};
		System.out.println(makeChange(4,coins));
	}

}
