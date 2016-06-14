package sort;


import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class BenchMark {

	static int[] input=null;
	private static void loadFile(String fileName)
	{
		input=null;
		ArrayList<Integer> inputArray=new ArrayList<Integer>();
		try{
			Scanner sc=new Scanner(new File(fileName));
			while(sc.hasNextInt())
			{
				inputArray.add(sc.nextInt());
			}
			sc.close();
		}catch(Exception e)
		{
			System.out.println("Error:"+ e.getMessage());
		
		}
		input=new int[inputArray.size()];
		for(int i=0;i<inputArray.size();i++){
			input[i]=inputArray.get(i);			
		}
		
	}
	private static void printArray()
	{
		for(int i:input)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fileName="data/sample.txt";
		
		if(args.length>0)
		{
			fileName=args[0];
		}
		loadFile(fileName);
		
		System.out.println("****BUBBLE SORT****");
		System.out.println("Before Sorting");
		printArray();
		
		
		BubbleSort bsort=new BubbleSort();
		
		bsort.doSort(input);
		
		System.out.println("After Sorting");
		printArray();
		
		System.out.println("*****MERGE SORT****");
		System.out.println("Before Sorting");
		loadFile(fileName);
		printArray();
		MergeSort msort=new MergeSort();
		
		loadFile(fileName);
		msort.doSort(input);
		
		System.out.println("After Sorting");
		printArray();

	}

}
