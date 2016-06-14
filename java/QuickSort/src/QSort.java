
public class QSort {

	int []inputArray;
	
	QSort(int[] i)
	{
		inputArray=i;
	}
	void swap(int i, int j)
	{
		int temp=inputArray[j];
		inputArray[j]=inputArray[i];
		inputArray[i]=temp;
	}
	void selectPivot(int start, int end)
	{
		int pivot=start+((int)(end-start)/2);
		//System.out.println("pivot of start:"+start+" end:"+end);
		//System.out.println("pivot "+inputArray[pivot]+"at"+pivot);
		swap(start,pivot);
	}
	
	void doQSort(int l, int k)
	{
		if(l>=k)
			return;
		selectPivot(l,k);
		int i=l+1;
		for(int j=l+1;j<=k;j++)
		{
			System.out.println("analysing:"+inputArray[j]+"at"+j);
			if(inputArray[j]<inputArray[l])
			{
				//System.out.println("swapping:"+inputArray[j]+","+inputArray[i]);
				swap(i,j);
				i++;
			}
		}
		swap(l,i-1);
		print();
		doQSort(l,i-2);
		doQSort(i,k);
		
	}
	
	void print(){
		
		for(int i=0;i<inputArray.length;i++)
		{
			System.out.print(inputArray[i]+" ");
		}
		System.out.println();
	}
	
}
