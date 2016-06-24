package Chapter6;

public class Problem4 {
	
	public static boolean canReachEnd(int[] maxSteps)
	{
		int lastIndex=maxSteps.length-1;
		int farthestToReach=0;
		
		for(int i=0;i<=farthestToReach && farthestToReach<lastIndex;i++)
		{
			System.out.print(farthestToReach);
			farthestToReach=Math.max(farthestToReach, maxSteps[i]+i);
			
		}
		return farthestToReach>=lastIndex;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]  num={2,4,1,1,0,2,3};
		
		System.out.println(canReachEnd(num));
		
		int[] num2={3,3,1,0,2,0,1};
		
		System.out.println(canReachEnd(num2));
		
	}

}
